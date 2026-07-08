package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.List;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.11pk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19621411pk extends AbstractC2255721DQs<InterfaceC19624811qI> implements InterfaceC19624811qI, InterfaceC379610EuV {
    public static final C19621611pm LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final Regex LLILZ = new Regex("^(https?:\\/\\/)?[a-zA-Z0-9\\-\\.]+\\.[a-zA-Z]{2,}(:[0-9]{1,5})?(\\/.*)?$");
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final EnumC19613311oR[] LLILZLL = EnumC19613311oR.values();

    /* JADX WARN: Type inference failed for: r0v7, types: [X.11pm] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19621411pk.class, "editorInfiniStickerApi", "getEditorInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C19621411pk.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0), new C2217381BqS(C19621411pk.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
        LLIZ = new Object() { // from class: X.11pm
        };
        LLJ = 8;
    }

    private final boolean w2(int i) {
        if (8304 > i) {
            return false;
        }
        if (i >= 11264) {
            if (12288 > i) {
                return false;
            }
            if (i >= 12544) {
                if (12800 > i) {
                    return false;
                }
                if (i >= 13056 && (126976 > i || i >= 129648)) {
                    return false;
                }
            }
        }
        return true;
    }

    public InterfaceC19624811qI X1() {
        return this;
    }

    private final void G2() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", bb2().getCreationId());
        c2344009Gk.LJIIIIZZ("enter_method", "click_button");
        String strLJJIIJ = C1428470nHB.LJJIIJ(bb2(), true);
        if (strLJJIIJ == null) {
            strLJJIIJ = "";
        }
        c2344009Gk.LJIIIIZZ("shoot_enter_from", strLJJIIJ);
        ShootExtraData shootExtraData = bb2().getCreativeFlowData().getShootExtraData();
        c2344009Gk.LJIIIIZZ("shoot_enter_method", shootExtraData != null ? shootExtraData.getShootEnterMethod() : null);
        c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
        C20684815ws.LJIILLIIL("link_sticker_edit_panel_show", c2344009Gk.LIZ);
    }

    private final InterfaceC391240FVq Z1() {
        return (InterfaceC391240FVq) this.LLILLL.getValue(this, LLIZLLLIL[1]);
    }

    private final InterfaceC391240FVq qj() {
        return (InterfaceC391240FVq) this.LLILLJJLI.getValue(this, LLIZLLLIL[0]);
    }

    public final void H2() {
        C20684815ws.LJIILLIIL("change_link_sticker_style_tip_show", new C2344009Gk().LIZ);
    }

    @Override // X.InterfaceC19624811qI
    public InterfaceC19656311vN LJIIJ() {
        return new InterfaceC19656311vN() { // from class: X.11pl
            @Override // X.InterfaceC19656311vN
            public final void q(String str) {
                String shootEnterMethod;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("creation_id", this.LIZ.bb2().getCreationId());
                c2344009Gk.LJIIIIZZ("enter_method", "click_button");
                String strLJJIIJ = C1428470nHB.LJJIIJ(this.LIZ.bb2(), true);
                if (strLJJIIJ == null) {
                    strLJJIIJ = "";
                }
                c2344009Gk.LJIIIIZZ("shoot_enter_from", strLJJIIJ);
                ShootExtraData shootExtraData = this.LIZ.bb2().getCreativeFlowData().getShootExtraData();
                if (shootExtraData != null) {
                    shootEnterMethod = shootExtraData.getShootEnterMethod();
                } else {
                    shootEnterMethod = null;
                }
                c2344009Gk.LJIIIIZZ("shoot_enter_method", shootEnterMethod);
                c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
                c2344009Gk.LJIIIIZZ("exit_method", str);
                C20684815ws.LJIILLIIL("link_sticker_edit_panel_exit", c2344009Gk.LIZ);
            }

            @Override // X.InterfaceC19656311vN
            public final void r(String str) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("error_type", str);
                C20684815ws.LJIILLIIL("link_sticker_input_error_warning_show", c2344009Gk.LIZ);
            }

            @Override // X.InterfaceC19656311vN
            public final boolean s(String str) {
                if (str.length() <= 1000) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC19656311vN
            public final boolean t(String str) {
                return this.LIZ.LLILZ.matches(str);
            }

            @Override // X.InterfaceC19656311vN
            public final boolean u(String str) {
                if (str.length() <= 4000) {
                    return true;
                }
                return false;
            }
        };
    }

    public final VideoPublishEditModel bb2() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLIZLLLIL[2]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (getDiContainer().LIZJ(InterfaceC391240FVq.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC391240FVq.class, new AwS608S0100000_29(this, 265));
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19621411pk(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final EnumC19613311oR T2(EnumC19613311oR enumC19613311oR) {
        EnumC19613311oR[] enumC19613311oRArr = this.LLILZLL;
        int length = enumC19613311oRArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (enumC19613311oR == enumC19613311oRArr[i]) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        EnumC19613311oR[] enumC19613311oRArr2 = this.LLILZLL;
        EnumC19613311oR enumC19613311oR2 = (EnumC19613311oR) C13LQ.LJJIIZ((i + 1) % enumC19613311oRArr2.length, enumC19613311oRArr2);
        if (enumC19613311oR2 == null) {
            return EnumC19613311oR.DEFAULT;
        }
        return enumC19613311oR2;
    }

    private final boolean W1(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (w2(Character.codePointAt(str, i))) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC19624811qI
    public void LJLLL(String str) {
        List<StickerModel> listLLLILZLLLI;
        StickerModel stickerModel;
        InterfaceC391240FVq interfaceC391240FVqQj;
        InterfaceC391240FVq interfaceC391240FVqQj2 = qj();
        if (interfaceC391240FVqQj2 != null && (listLLLILZLLLI = interfaceC391240FVqQj2.LLLILZLLLI(EnumC1466150oFx.LINK)) != null && (stickerModel = (StickerModel) C13LP.LJJJLL(listLLLILZLLLI)) != null) {
            if (str.length() > 0 && (interfaceC391240FVqQj = qj()) != null) {
                interfaceC391240FVqQj.sS(stickerModel);
            }
        } else {
            InterfaceC391240FVq interfaceC391240FVqZ1 = Z1();
            if (interfaceC391240FVqZ1 != null) {
                interfaceC391240FVqZ1.Tn0(EnumC1466150oFx.LINK, null, str, AFwS273S0000000_29.get$arr$(148));
            }
        }
        G2();
    }

    private final EnumC19613311oR o2(EnumC19613311oR enumC19613311oR, String str) {
        EnumC19613311oR enumC19613311oRT2 = T2(enumC19613311oR);
        if (enumC19613311oRT2 == EnumC19613311oR.STYLE_2 && W1(str)) {
            enumC19613311oRT2 = T2(enumC19613311oRT2);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", bb2().getCreationId());
        c2344009Gk.LIZJ(enumC19613311oRT2.getType(), "to_style");
        C20684815ws.LJIILLIIL("tap_to_change_link_sticker_style", c2344009Gk.LIZ);
        return enumC19613311oRT2;
    }

    @Override // X.InterfaceC19624811qI
    public EnumC19613311oR hB1(EnumC19613311oR enumC19613311oR, String str) {
        return o2(enumC19613311oR, str);
    }
}

package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEEditor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EUH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EUH extends C0ETX<C0EUD, C0EUR, C0EUM, C0EUT> implements C0EUD {
    public static final C0EUK LLLFF;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public static final int LLLFZ;
    public final Activity LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public String LLJLLL;
    public Float LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0EUK] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EUH.class, "editorProInitApi", "getEditorProInitApi()Lcom/ss/android/ugc/gamora/editorpro/startup/api/EditorProInitApi;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0EUH.class, "resPreloadApi", "getResPreloadApi()Lcom/ss/android/ugc/gamora/editorpro/components/IEditorProResPreloadApi;", 0), new C2217381BqS(C0EUH.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0), new C2217381BqS(C0EUH.class, "previewPanelApi", "getPreviewPanelApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0), new C2217381BqS(C0EUH.class, "epFullScreenApi", "getEpFullScreenApi()Lcom/ss/android/ugc/gamora/editorpro/framework/fullscreen/EditorProFullScreenApi;", 0)};
        LLLFF = new Object() { // from class: X.0EUK
        };
        LLLFZ = 8;
    }

    public C0EUD N5() {
        return this;
    }

    private final InterfaceC360800ECo R5() {
        return (InterfaceC360800ECo) this.LLJL.getValue(this, LLLFFI[2]);
    }

    private final InterfaceC362600EJm U5() {
        return (InterfaceC362600EJm) this.LLJLILLLLZIIL.getValue(this, LLLFFI[4]);
    }

    @Override // ge.i
    public Function0<C0EUR> E3() {
        return new AwS549S0100000_5(this, 433);
    }

    public final C0EUJ H5() {
        return (C0EUJ) this.LLJLLIL.getValue();
    }

    public final C0EUR M5() {
        return (C0EUR) this.LLJLL.getValue();
    }

    public final C0EFH S5() {
        return (C0EFH) this.LLJJL.getValue(this, LLLFFI[0]);
    }

    public final InterfaceC361710EGb d6() {
        return (InterfaceC361710EGb) this.LLJLIL.getValue(this, LLLFFI[3]);
    }

    public final C0E4L m6() {
        return (C0E4L) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLFFI[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EUM> o2() {
        return AFwS191S0000000_5.get$arr$(134);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EUT> w2() {
        return new AwS549S0100000_5(this, 432);
    }

    private final void E5() {
        boolean zLLLII;
        C0E55 player;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0EF5 c0ef5LLLI = M5().LLLLLJLJLL().LLLI();
        if (c0ef5LLLI == null) {
            return;
        }
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) != null) {
            nLETrackSlotLLLLLLIL.setExtra("last_adjust_item", c0ef5LLLI.LIZ.getNleName());
        }
        C0E1X c0e1x = new C0E1X(C0E1V.APPLY_ADJUST.getNameId(), null, null, this.LLJJJJJIL.getString(c0ef5LLLI.LIZJ), null, 22);
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null) {
            C350870DpF.LIZJ(c0e48F42, C051R.LIZIZ(c0e1x));
        }
        C0E48 c0e48F43 = F4();
        if (c0e48F43 != null && (player = c0e48F43.getPlayer()) != null) {
            player.LJJIIZ(Integer.valueOf(VEEditor.SEEK_MODE.EDITOR_REFRESH_MODE_FOECE.getValue()));
        }
        C0EF4 c0ef4LLLLLJLJLL = M5().LLLLLJLJLL();
        C0EF5 c0ef5 = c0ef4LLLLLJLJLL.LLILLL;
        if (c0ef5 != null && c0ef5.LJ != (zLLLII = C0EF4.LLLII(c0ef5))) {
            c0ef5.LJ = zLLLII;
            c0ef4LLLLLJLJLL.notifyItemChanged(c0ef4LLLLLJLJLL.LL.indexOf(c0ef5));
        }
        s7();
    }

    private final void k7() {
        if (!C0BZ6.LIZ(LJJJLIIL()) || C363750ENx.LIZIZ("has_show_auto_adjust_guide")) {
            return;
        }
        C0EF4 c0ef4LLLLLJLJLL = M5().LLLLLJLJLL();
        c0ef4LLLLLJLJLL.LLILZ = true;
        Iterator<C0EF5> it2 = c0ef4LLLLLJLJLL.LL.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (it2.next().LIZ == EnumC355950DxR.AUTO_ADJUST) {
                break;
            } else {
                i++;
            }
        }
        c0ef4LLLLLJLJLL.notifyItemChanged(i);
        C363750ENx.LJ("has_show_auto_adjust_guide");
    }

    private final void n7() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        String extra;
        Object obj;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) == null || (extra = nLETrackSlotLLLLLLIL.getExtra("last_adjust_item")) == null || (obj = ((Map) C351330Dpz.LIZ.getValue()).get(extra)) == null) {
            return;
        }
        C0EF4 c0ef4LLLLLJLJLL = M5().LLLLLJLJLL();
        Iterator<C0EF5> it2 = c0ef4LLLLLJLJLL.LL.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (it2.next().LIZ == obj) {
                break;
            } else {
                i++;
            }
        }
        c0ef4LLLLLJLJLL.LLLIIIIL(i);
        i3(new AwS20S0001000_5(i, 13));
        C0EF5 c0ef5LLLI = M5().LLLLLJLJLL().LLLI();
        if (c0ef5LLLI != null) {
            u7(c0ef5LLLI);
        }
    }

    private final void u6() {
        LiveEvent<Pair<EnumC357140DzM, Boolean>> liveEventEb1;
        MutableLiveData mutableLiveDataLIZ;
        MutableLiveData mutableLiveDataLIZ2;
        LiveData<List<Effect>> liveDataH52;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        List<Effect> value;
        C0E4L c0e4lM6;
        C0E4L c0e4lM62 = m6();
        if (c0e4lM62 != null && c0e4lM62.UV0() && (((value = c0e4lM62.h52().getValue()) == null || value.isEmpty()) && (c0e4lM6 = m6()) != null)) {
            c0e4lM6.to2();
        }
        C0E48 c0e48F4 = F4();
        this.LLJLLL = (c0e48F4 == null || (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) == null) ? null : nLETrackSlotLLLLLLIL.getUUID();
        H5().LJI();
        C0E4L c0e4lM63 = m6();
        if (c0e4lM63 != null && (liveDataH52 = c0e4lM63.h52()) != null) {
            liveDataH52.observe(this, new AObserverS209S0100000_5(this, 47));
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (mutableLiveDataLIZ2 = c0e48F42.S7().LIZ("selected_nle_track_slot")) != null) {
            mutableLiveDataLIZ2.observe(this, new AObserverS209S0100000_5(this, 48));
        }
        C0E48 c0e48F43 = F4();
        if (c0e48F43 != null && (mutableLiveDataLIZ = c0e48F43.S7().LIZ("edit_hsl_key")) != null) {
            mutableLiveDataLIZ.observe(this, new AObserverS209S0100000_5(this, 49));
        }
        InterfaceC357900E1k interfaceC357900E1kH4 = H4();
        if (interfaceC357900E1kH4 != null && (liveEventEb1 = interfaceC357900E1kH4.eb1()) != null) {
            liveEventEb1.LIZ(this, new AObjectS240S0100000_5(this, 66));
        }
        n7();
        s7();
        InterfaceC361710EGb interfaceC361710EGbD6 = d6();
        if (interfaceC361710EGbD6 != null) {
            interfaceC361710EGbD6.Ho2(new AwS584S0100000_5(this, 364));
        }
    }

    public final void K6() {
        C0E48 c0e48F4;
        C385670FAf<C0ELJ> initData;
        C0ELJ c0eljLIZJ;
        boolean z = false;
        H5().LIZLLL(false, true);
        C0EFH c0efhS5 = S5();
        if (c0efhS5 != null && (initData = c0efhS5.getInitData()) != null && (c0eljLIZJ = initData.LIZJ()) != null && c0eljLIZJ.isTemplateCreate()) {
            z = true;
        }
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL == null || (c0e48F4 = F4()) == null) {
            return;
        }
        C361680EFy.LJJIJL(videoPublishEditModelLJJJLIIL, c0e48F4, z);
    }

    public final void L6() {
        H5().LIZLLL(true, false);
    }

    @Override // X.C0ETX
    public void Xi() {
        super.Xi();
        if (getDiContainer().LIZJ(InterfaceC362600EJm.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC362600EJm.class, new AwS584S0100000_5(this, 365));
        }
    }

    public final void d7() {
        H5().LJI();
        C0EF5 c0ef5LLLI = M5().LLLLLJLJLL().LLLI();
        if (c0ef5LLLI != null) {
            u7(c0ef5LLLI);
        }
        s7();
    }

    public final void o7() {
        C0E55 player;
        H5().LJ();
        C0E1X c0e1x = new C0E1X(C0E1V.APPLY_ADJUST.getNameId(), null, null, this.LLJJJJJIL.getString(2131825199), null, 22);
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            C350870DpF.LIZJ(c0e48F4, C051R.LIZIZ(c0e1x));
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (player = c0e48F42.getPlayer()) != null) {
            player.LJJIIZ(Integer.valueOf(VEEditor.SEEK_MODE.EDITOR_REFRESH_MODE_FOECE.getValue()));
        }
        C0EF5 c0ef5LLLI = M5().LLLLLJLJLL().LLLI();
        if (c0ef5LLLI != null) {
            u7(c0ef5LLLI);
        }
        s7();
        this.LLJZ = null;
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        u6();
        k7();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC361710EGb interfaceC361710EGbD6 = d6();
        if (interfaceC361710EGbD6 != null) {
            interfaceC361710EGbD6.dP1(false);
        }
        super.onDestroy();
    }

    public final void s7() {
        boolean zLLLFZ = M5().LLLLLJLJLL().LLLFZ();
        i3(new AwS20S0010000_5(zLLLFZ, 19));
        if (zLLLFZ && C0BZ6.LIZ(LJJJLIIL())) {
            if (!C357780E0y.LIZ()) {
                i3(AFwS234S0000000_5.get$arr$(189));
                return;
            }
            InterfaceC361710EGb interfaceC361710EGbD6 = d6();
            if (interfaceC361710EGbD6 != null) {
                interfaceC361710EGbD6.dP1(true);
                return;
            }
            return;
        }
        if (!C357780E0y.LIZ()) {
            i3(AFwS234S0000000_5.get$arr$(190));
            return;
        }
        InterfaceC361710EGb interfaceC361710EGbD62 = d6();
        if (interfaceC361710EGbD62 != null) {
            interfaceC361710EGbD62.dP1(false);
        }
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        N5();
        return this;
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    private final void P6(C0EF5 c0ef5) {
        Float fValueOf;
        if (c0ef5.LJ) {
            this.LLJZ = Float.valueOf(c0ef5.LJIIIIZZ);
            fValueOf = Float.valueOf(0.0f);
        } else {
            fValueOf = this.LLJZ;
        }
        if (fValueOf != null) {
            H5().LIZJ(fValueOf.floatValue());
            C0EF5 c0ef5LLLI = M5().LLLLLJLJLL().LLLI();
            if (c0ef5LLLI != null) {
                u7(c0ef5LLLI);
            }
            E5();
        }
    }

    private final void u7(C0EF5 c0ef5) {
        if (c0ef5.LIZ == EnumC355950DxR.HSL) {
            i3(AFwS234S0000000_5.get$arr$(191));
        } else if (this.LLJZIJLIL) {
            i3(AFwS234S0000000_5.get$arr$(192));
        } else {
            i3(AFwS234S0000000_5.get$arr$(193));
        }
        i3(new AwS584S0100000_5(c0ef5, 366));
    }

    public final void T6(C0EF5 c0ef5) {
        C0E55 player;
        if (c0ef5 == null) {
            return;
        }
        if (c0ef5.LJI == null) {
            H5().LIZ(c0ef5.LIZ, 0.0f, false);
        }
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
            player.pause(false);
        }
    }

    public final void J6(C0EF5 c0ef5, int i) {
        boolean z;
        NLEEditor nLEEditorLJI;
        NLEBranch branch;
        NLECommit head;
        String uuid;
        InterfaceC360800ECo interfaceC360800ECoR5;
        C0E48 c0e48F4;
        String extra;
        Integer num;
        Float fValueOf;
        C0E48 c0e48F42;
        NLEResType resourceType;
        String str;
        NLESegment mainSegment;
        NLEResourceNode resource;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48F43;
        NLEResType resourceType2;
        String str2;
        String str3;
        NLESegment mainSegment2;
        NLEResourceNode resource2;
        C385670FAf<C0ELJ> initData;
        C0ELJ c0eljLIZJ;
        C0EFH c0efhS5 = S5();
        if (c0efhS5 != null && (initData = c0efhS5.getInitData()) != null && (c0eljLIZJ = initData.LIZJ()) != null && c0eljLIZJ.isTemplateCreate()) {
            z = true;
        } else {
            z = false;
        }
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        String str4 = "2";
        String str5 = CardStruct.IStatusCode.DEFAULT;
        if (videoPublishEditModelLJJJLIIL != null && (c0e48F43 = F4()) != null) {
            String nleName = c0ef5.LIZ.getNleName();
            NLETrackSlot nLETrackSlotLLLLLLIL2 = c0e48F43.LLLLLLIL();
            if (nLETrackSlotLLLLLLIL2 != null && (mainSegment2 = nLETrackSlotLLLLLLIL2.getMainSegment()) != null && (resource2 = mainSegment2.getResource()) != null) {
                resourceType2 = resource2.getResourceType();
            } else {
                resourceType2 = null;
            }
            if (resourceType2 == NLEResType.VIDEO) {
                str2 = "1";
            } else if (resourceType2 == NLEResType.IMAGE) {
                str2 = "2";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F43, new Pair(-1, -1));
            if (z) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLJFF.LJ("is_from_create_template", str3);
            c0labLJFF.LJ("is_editor_pro", "1");
            c0labLJFF.LJ("tab_name", nleName);
            c0labLJFF.LJ("select_material_type", str2);
            C20684815ws.LJIILLIIL("adjust_click", c0labLJFF.LIZ);
        }
        if (C0BZ6.LIZ(LJJJLIIL()) && c0ef5.LJFF && c0ef5.LIZ != EnumC355950DxR.HSL) {
            P6(c0ef5);
            return;
        }
        this.LLJZ = null;
        i3(new AwS20S0001000_5(i, 12));
        u7(c0ef5);
        if (!this.LLJZIJLIL && !this.LLL) {
            i3(AFwS234S0000000_5.get$arr$(188));
            C0E4L c0e4lM6 = m6();
            if (c0e4lM6 != null) {
                c0e4lM6.to2();
            }
        }
        C0E48 c0e48F44 = F4();
        if (c0e48F44 == null || c0e48F44.LLLLLLIL() == null) {
            H5().LJFF();
            C0E1X c0e1x = new C0E1X(C0E1V.APPLY_ADJUST.getNameId(), null, null, this.LLJJJJJIL.getString(2131825206), null, 22);
            C0E48 c0e48F45 = F4();
            if (c0e48F45 != null) {
                C350870DpF.LIZJ(c0e48F45, C051R.LIZIZ(c0e1x));
            }
            InterfaceC360800ECo interfaceC360800ECoR52 = R5();
            if (interfaceC360800ECoR52 != null) {
                C0EB4.LIZIZ(interfaceC360800ECoR52, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO}, null, Boolean.FALSE, null, null, 26);
            }
            C0E48 c0e48F46 = F4();
            if (c0e48F46 != null && (nLEEditorLJI = c0e48F46.LLFII().LJI()) != null && (branch = nLEEditorLJI.getBranch()) != null && (head = branch.getHead()) != null && (uuid = head.getUUID()) != null && (interfaceC360800ECoR5 = R5()) != null) {
                interfaceC360800ECoR5.Wh1(uuid, true);
            }
        }
        if (!c0ef5.LJ) {
            EnumC355950DxR enumC355950DxR = c0ef5.LIZ;
            EnumC355950DxR enumC355950DxR2 = EnumC355950DxR.AUTO_ADJUST;
            if (enumC355950DxR == enumC355950DxR2) {
                C0E48 c0e48F47 = F4();
                if (c0e48F47 != null && (nLETrackSlotLLLLLLIL = c0e48F47.LLLLLLIL()) != null) {
                    extra = nLETrackSlotLLLLLLIL.getExtra("has_use_default_intensity");
                } else {
                    extra = null;
                }
                if (Intrinsics.LJFF(extra, enumC355950DxR2.getNleName())) {
                    return;
                }
                VideoPublishEditModel videoPublishEditModelLJJJLIIL2 = LJJJLIIL();
                if (videoPublishEditModelLJJJLIIL2 != null && (c0e48F42 = F4()) != null) {
                    NLETrackSlot nLETrackSlotLLLLLLIL3 = c0e48F42.LLLLLLIL();
                    if (nLETrackSlotLLLLLLIL3 != null && (mainSegment = nLETrackSlotLLLLLLIL3.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                        resourceType = resource.getResourceType();
                    } else {
                        resourceType = null;
                    }
                    if (resourceType == NLEResType.VIDEO) {
                        str4 = "1";
                    } else if (resourceType != NLEResType.IMAGE) {
                        str4 = CardStruct.IStatusCode.DEFAULT;
                    }
                    C0LAB c0labLJFF2 = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL2, c0e48F42, new Pair(-1, -1));
                    if (z) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c0labLJFF2.LJ("is_from_create_template", str);
                    c0labLJFF2.LJ("is_editor_pro", "1");
                    c0labLJFF2.LJ("tab_name", "auto_adjust");
                    c0labLJFF2.LJ("select_material_type", str4);
                    c0labLJFF2.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success");
                    C20684815ws.LJIILLIIL("auto_adjust_apply_status", c0labLJFF2.LIZ);
                }
                if (this.LLJZIJLIL && (num = c0ef5.LJII) != null && (fValueOf = Float.valueOf(num.intValue() / 100.0f)) != null) {
                    float fFloatValue = fValueOf.floatValue();
                    if (c0ef5.LJI == null) {
                        H5().LIZ(c0ef5.LIZ, fFloatValue, true);
                    } else {
                        H5().LIZJ(fFloatValue);
                    }
                    C0EF5 c0ef5LLLI = M5().LLLLLJLJLL().LLLI();
                    if (c0ef5LLLI != null) {
                        u7(c0ef5LLLI);
                    }
                    E5();
                    InterfaceC361710EGb interfaceC361710EGbD6 = d6();
                    if (interfaceC361710EGbD6 != null) {
                        interfaceC361710EGbD6.d80();
                    }
                }
            }
        }
        if (c0ef5.LIZ == EnumC355950DxR.HSL) {
            this.LLLF = true;
            C0ETQ c0etqP4 = P4();
            if (c0etqP4 != null) {
                c0etqP4.IZ0(C364990ESr.class, null, null);
            }
            VideoPublishEditModel videoPublishEditModelLJJJLIIL3 = LJJJLIIL();
            if (videoPublishEditModelLJJJLIIL3 != null && (c0e48F4 = F4()) != null) {
                C0LAB c0labLJFF3 = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL3, c0e48F4, new Pair(-1, -1));
                if (z) {
                    str5 = "1";
                }
                c0labLJFF3.LJ("is_from_create_template", str5);
                c0labLJFF3.LJ("is_editor_pro", "1");
                C20684815ws.LJIILLIIL("hsl_show", c0labLJFF3.LIZ);
            }
        }
    }

    public final void N6(EnumC355950DxR enumC355950DxR, int i) {
        C0E48 c0e48F4;
        NLEResType resourceType;
        String str;
        NLESegment mainSegment;
        NLEResourceNode resource;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null && (c0e48F4 = F4()) != null) {
            String nleName = enumC355950DxR.getNleName();
            NLETrackSlot nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL();
            if (nLETrackSlotLLLLLLIL != null && (mainSegment = nLETrackSlotLLLLLLIL.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                resourceType = resource.getResourceType();
            } else {
                resourceType = null;
            }
            if (resourceType == NLEResType.VIDEO) {
                str = "1";
            } else if (resourceType == NLEResType.IMAGE) {
                str = "2";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F4, new Pair(-1, -1));
            c0labLJFF.LJ("is_editor_pro", "1");
            c0labLJFF.LJ("tab_name", nleName);
            c0labLJFF.LJ("select_material_type", str);
            C20684815ws.LJIILLIIL("adjust_show", c0labLJFF.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6(int r12, X.C0EF5 r13) {
        /*
            r11 = this;
            r11.u7(r13)
            r11.E5()
            X.0EFH r0 = r11.S5()
            if (r0 == 0) goto L9b
            X.0FAf r0 = r0.getInitData()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r0.LIZJ()
            X.0ELJ r0 = (X.C0ELJ) r0
            if (r0 == 0) goto L9b
            boolean r0 = r0.isTemplateCreate()
            r8 = 1
            if (r0 != r8) goto L9b
        L21:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9 = r11.LJJJLIIL()
            if (r9 == 0) goto L8f
            X.0E48 r7 = r11.F4()
            if (r7 == 0) goto L8f
            X.0DxR r0 = r13.LIZ
            java.lang.String r5 = r0.getNleName()
            float r0 = r13.LJIIIIZZ
            java.lang.String r4 = java.lang.String.valueOf(r0)
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r7.LLLLLLIL()
            if (r0 == 0) goto L99
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r0.getMainSegment()
            if (r0 == 0) goto L99
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r0.getResource()
            if (r0 == 0) goto L99
            com.bytedance.ies.nle.editor_jni.NLEResType r1 = r0.getResourceType()
        L4f:
            com.bytedance.ies.nle.editor_jni.NLEResType r0 = com.bytedance.ies.nle.editor_jni.NLEResType.VIDEO
            java.lang.String r6 = "0"
            java.lang.String r3 = "1"
            if (r1 != r0) goto L90
            r2 = r3
        L58:
            kotlin.Pair r10 = new kotlin.Pair
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.<init>(r1, r0)
            r0 = -1
            X.0LAB r1 = X.C361680EFy.LJFF(r0, r9, r7, r10)
            if (r8 == 0) goto L6f
            r6 = r3
        L6f:
            java.lang.String r0 = "is_from_create_template"
            r1.LJ(r0, r6)
            java.lang.String r0 = "is_editor_pro"
            r1.LJ(r0, r3)
            java.lang.String r0 = "tab_name"
            r1.LJ(r0, r5)
            java.lang.String r0 = "select_material_type"
            r1.LJ(r0, r2)
            java.lang.String r0 = "adjust_value"
            r1.LJ(r0, r4)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.LIZ
            java.lang.String r0 = "adjust_value_slide"
            X.C20684815ws.LJIILLIIL(r0, r1)
        L8f:
            return
        L90:
            com.bytedance.ies.nle.editor_jni.NLEResType r0 = com.bytedance.ies.nle.editor_jni.NLEResType.IMAGE
            if (r1 != r0) goto L97
            java.lang.String r2 = "2"
            goto L58
        L97:
            r2 = r6
            goto L58
        L99:
            r1 = 0
            goto L4f
        L9b:
            r8 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EUH.W6(int, X.0EF5):void");
    }

    public C0EUH(C19A3 c19a3, Activity activity, C1DRG c1drg) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = activity;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), C0EFH.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), C0E4L.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC362600EJm.class, null);
        this.LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 431));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 430));
    }

    public final void S6(int i, boolean z, C0EF5 c0ef5, int i2, boolean z2) {
        boolean z3;
        Activity activity;
        Integer num;
        if (z) {
            if (c0ef5 != null && (num = c0ef5.LJII) != null && num.intValue() == i) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i2 == 0 || z3) && (activity = this.LLJJJJJIL) != null) {
                new C0ZDN(activity).LIZ(0);
            }
            H5().LIZJ(i2 / 100.0f);
        }
    }
}

package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10KB, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10KB extends C193N<C05YF, C190Z, C19224710Iz> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final C01GW LLJ;
    public final String LLJI;
    public final Function0<C190Z> LLJIJIL;
    public final C19224710Iz LLJILJIL;
    public final C10J3 LLJILJILJ;
    public final InterfaceC1738600vLO LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C10KB.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C10KB.class, "context", "getContext()Landroid/content/Context;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJI = 8;
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJJ[0]);
    }

    public final Keva O4() {
        return (Keva) this.LLJ.getValue();
    }

    public final Context getContext() {
        return (Context) this.LLIZLLLIL.getValue(this, LLJJ[1]);
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJILJIL;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJILLL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJILJILJ;
    }

    public C19224710Iz K4() {
        return this.LLJILJIL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLJIJIL;
    }

    public C10KB(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), Context.class, null);
        this.LLJ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS217S0000000_28.get$arr$(375));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mall_publish_identify_products_on_");
        sbLIZ.append(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        this.LLJI = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJIJIL = new AwS572S0100000_28(this, 552);
        this.LLJILJIL = new C19224710Iz(null, null, new C19332510kF(this, 9), null, 11);
        this.LLJILJILJ = AnonymousClass1937.LIZ;
        this.LLJILLL = EnumC214771193h.IDENTIFY_SIMILAR_PRODUCTS;
    }

    public final void P4(String str) {
        C20684815ws.LJIJ("tiktokec_creation_identify_product", new JSONObject().put("EVENT_ORIGIN_FEATURE", "TEMAI").put("action_type", str).put("enter_from", "video_post_page").put("content_type", C1428470nHB.LJIILL(getEditModel())).put("content_source", C1428470nHB.LJIILIIL(getEditModel())));
    }
}

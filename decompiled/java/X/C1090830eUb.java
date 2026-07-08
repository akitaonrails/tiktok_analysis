package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090830eUb {
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final boolean LIZJ;
    public Object LJ;
    public Object LJII;
    public ILiveGiftDelegatePlayerService LIZLLL = (ILiveGiftDelegatePlayerService) C1161920gLG.LIZJ(ILiveGiftDelegatePlayerService.class);
    public String LJFF = "";
    public String LJI = "";
    public C1090840eUc LJIIIIZZ = new InterfaceC2280931EPr() { // from class: X.0eUc
        @Override // X.InterfaceC2280931EPr
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC2280931EPr
        public final void LJII() {
            C1090830eUb c1090830eUb = this.LIZ;
            String str = c1090830eUb.LJI;
            String str2 = c1090830eUb.LJFF;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            C0K04.LIZLLL(1, "play_status", jSONObject);
            if (str == null) {
                str = "unkown";
            }
            C0K04.LJFF("channel", str, jSONObject);
            if (str2 == null) {
                str2 = "unkown";
            }
            C0K04.LJFF("videoname", str2, jSONObject);
            C0K04.LJII("extra", jSONObject4, jSONObject3);
            C1CC2.LJ("ttlive_barrage_player_status_event", jSONObject, jSONObject2, jSONObject4);
        }

        @Override // X.InterfaceC2280931EPr
        public final void onEnd() {
            this.LIZ.getClass();
            C1090830eUb c1090830eUb = this.LIZ;
            C1090900eUi.LIZ(c1090830eUb.LJI, c1090830eUb.LJFF, true);
        }

        @Override // X.InterfaceC2280931EPr
        public final void onStart() {
            this.LIZ.getClass();
        }

        @Override // X.InterfaceC2280931EPr
        public final void onStop() {
            this.LIZ.getClass();
        }

        @Override // X.InterfaceC2280931EPr
        public final void LIZ(int i, String str, boolean z) {
            int iIntValue;
            this.LIZ.getClass();
            if (z) {
                C1090830eUb c1090830eUb = this.LIZ;
                String str2 = c1090830eUb.LJI;
                String str3 = c1090830eUb.LJFF;
                Integer numValueOf = Integer.valueOf(i);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                C0K04.LIZLLL(2, "play_status", jSONObject);
                if (str2 == null) {
                    str2 = "unkown";
                }
                C0K04.LJFF("channel", str2, jSONObject);
                if (str3 == null) {
                    str3 = "unkown";
                }
                C0K04.LJFF("videoname", str3, jSONObject);
                if (str == null) {
                    str = "unkown";
                }
                C0K04.LJFF("error_msg", str, jSONObject3);
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = -1;
                }
                C0K04.LIZLLL(iIntValue, "error_code", jSONObject3);
                C0K04.LJII("extra", jSONObject4, jSONObject3);
                C1CC2.LJ("ttlive_barrage_player_status_event", jSONObject, jSONObject2, jSONObject4);
                return;
            }
            C1090830eUb c1090830eUb2 = this.LIZ;
            C1090900eUi.LIZ(c1090830eUb2.LJI, c1090830eUb2.LJFF, false);
        }
    };

    public final void LIZ() {
        this.LJFF = "";
        this.LJI = "";
        ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService = this.LIZLLL;
        if (iLiveGiftDelegatePlayerService != null) {
            iLiveGiftDelegatePlayerService.tryCancel(this.LJ);
        }
        ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService2 = this.LIZLLL;
        if (iLiveGiftDelegatePlayerService2 != null) {
            iLiveGiftDelegatePlayerService2.clearMasks(this.LJ);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZIZ() {
        if (this.LJ == null && this.LIZ != null) {
            ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService = this.LIZLLL;
            Object objCreateLiveGiftPlayController = null;
            this.LJII = iLiveGiftDelegatePlayerService != null ? iLiveGiftDelegatePlayerService.buildDelegateGiftPlayListener(this.LJIIIIZZ) : null;
            ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService2 = this.LIZLLL;
            if (iLiveGiftDelegatePlayerService2 != null) {
                Context context = this.LIZ;
                objCreateLiveGiftPlayController = iLiveGiftDelegatePlayerService2.createLiveGiftPlayController(context, context != null ? C500260Jjc.LJ(context) : null, this.LJII, this.LIZIZ);
            }
            this.LJ = objCreateLiveGiftPlayController;
        }
    }

    public final void LIZJ() {
        this.LJI = "";
        this.LJFF = "";
        ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService = this.LIZLLL;
        if (iLiveGiftDelegatePlayerService != null) {
            iLiveGiftDelegatePlayerService.releasePlayer(this.LJ, this.LJII, this.LIZIZ);
        }
        this.LJIIIIZZ = null;
        this.LJ = null;
        this.LJII = null;
        this.LIZLLL = null;
    }

    public final void LIZLLL(String str) {
        View alphaView;
        View alphaView2;
        if (this.LIZJ) {
            if (C497740JfY.LJJ()) {
                ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService = this.LIZLLL;
                if (iLiveGiftDelegatePlayerService != null && (alphaView2 = iLiveGiftDelegatePlayerService.getAlphaView(this.LJ)) != null) {
                    C786410Ut5.Ib(alphaView2, 180.0f);
                }
            } else {
                ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService2 = this.LIZLLL;
                if (iLiveGiftDelegatePlayerService2 != null && (alphaView = iLiveGiftDelegatePlayerService2.getAlphaView(this.LJ)) != null) {
                    C786410Ut5.Ib(alphaView, 0.0f);
                }
            }
        }
        ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService3 = this.LIZLLL;
        if (iLiveGiftDelegatePlayerService3 != null) {
            iLiveGiftDelegatePlayerService3.setAutoReleaseParam(this.LJ, false);
        }
        ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService4 = this.LIZLLL;
        if (iLiveGiftDelegatePlayerService4 != null) {
            iLiveGiftDelegatePlayerService4.start(this.LJ, str, 0L);
        }
        String str2 = this.LJI;
        String str3 = this.LJFF;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        C0K04.LIZLLL(0, "play_status", jSONObject);
        if (str2 == null) {
            str2 = "unkown";
        }
        C0K04.LJFF("channel", str2, jSONObject);
        if (str3 == null) {
            str3 = "unkown";
        }
        C0K04.LJFF("videoname", str3, jSONObject);
        C0K04.LJII("extra", jSONObject4, jSONObject3);
        C1CC2.LJ("ttlive_barrage_player_status_event", jSONObject, jSONObject2, jSONObject4);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0eUc] */
    public C1090830eUb(Context context, FrameLayout frameLayout, boolean z) {
        this.LIZ = context;
        this.LIZIZ = frameLayout;
        this.LIZJ = z;
    }
}

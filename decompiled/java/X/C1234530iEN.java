package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0iEN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234530iEN {
    public final BaseListFragmentPanel LIZ;
    public final C1233510iCj LIZIZ;
    public final String LIZJ;
    public final User LIZLLL;
    public boolean LJ;
    public InterfaceC1234410iEB LJFF;
    public AnonymousClass0956 LJI;
    public Aweme LJII;
    public AnonymousClass0957<? extends C189200o6<? extends Aweme>> LJIIIIZZ;
    public Long LJIIIZ;

    public final void LIZ() {
        if (this.LJ) {
            C2276471E8n.LIZIZ.LIZIZ("recommend_feed", "@LinkRelation_Video", "invoke dialog operator, isShowing!");
            return;
        }
        Aweme aweme = this.LJII;
        if (aweme != null && AwemeBizExtKt.getSharer(aweme) != null) {
            this.LJFF = LIZJ(aweme);
            return;
        }
        if (C0BY3.LIZ() && this.LJIIIIZZ != null) {
            this.LJI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), C0PEM.LIZJ, null, new C1234550iEP(this, null), 2);
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), C0PEM.LIZJ, null, new C1234560iEQ(this, null), 2);
        C2276471E8n.LIZIZ.LIZIZ("recommend_feed", "@LinkRelation_Video", "asyncShowDialog!");
    }

    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC1234410iEB interfaceC1234410iEB = this.LJFF;
        if (interfaceC1234410iEB != null) {
            interfaceC1234410iEB.LIZJ(C1234420iEC.LIZ);
        }
    }

    public final InterfaceC1234410iEB LIZJ(Aweme aweme) {
        C2276471E8n.LIZIZ.LIZIZ("recommend_feed", "@LinkRelation_Video", "show dialog with aweme");
        InterfaceC1234410iEB interfaceC1234410iEBLJII = C1234690iEd.LIZIZ.LJII();
        interfaceC1234410iEBLJII.LIZLLL(new InterfaceC1234720iEg() { // from class: X.0iEM
            @Override // X.InterfaceC1234720iEg
            public final void LIZ(Aweme aweme2) {
                C1234530iEN c1234530iEN = this.LIZ;
                c1234530iEN.LJ = true;
                c1234530iEN.LIZ.LLIIL(new C737030Svd(44));
                C2276471E8n.LIZIZ.LIZIZ("recommend_feed", "@LinkRelation_Video", "onShow(), set video pause!");
            }

            @Override // X.InterfaceC1234720iEg
            public final void LIZIZ(AbstractC1234430iED abstractC1234430iED) {
                if (abstractC1234430iED instanceof C1234450iEF) {
                    C1234530iEN c1234530iEN = this.LIZ;
                    new C1234490iEJ(c1234530iEN.LIZ, ((C1234450iEF) abstractC1234430iED).LIZ, new AwS563S0100000_19(c1234530iEN, 1438)).LIZ();
                } else if (abstractC1234430iED instanceof C1234440iEE) {
                    C1234530iEN c1234530iEN2 = this.LIZ;
                    new C1234490iEJ(c1234530iEN2.LIZ, ((C1234440iEE) abstractC1234430iED).LIZ, new AwS563S0100000_19(c1234530iEN2, 1439)).LIZ();
                }
                this.LIZ.LJ = false;
                if (((Number) C278750AwD.LIZ.getValue()).intValue() != 1) {
                    this.LIZ.LIZ.LLIIL(new C737030Svd(59));
                }
            }

            @Override // X.InterfaceC1234720iEg
            public final void LIZJ(EnumC1233410iCZ enumC1233410iCZ, Aweme aweme2) {
                this.LIZ.LJ = false;
            }
        });
        C19EG c19egRequireActivity = this.LIZ.getFragment().requireActivity();
        C1233510iCj c1233510iCj = this.LIZIZ;
        C627150Oin c627150Oin = new C627150Oin();
        C786410Ut5.LJJJI("enter_from", this.LIZ.getEventType(), c627150Oin.LIZ);
        C786410Ut5.LJJJI("click_time", String.valueOf(this.LJIIIZ), c627150Oin.LIZ);
        interfaceC1234410iEBLJII.LIZIZ(c19egRequireActivity, c1233510iCj, aweme, c627150Oin.LIZ);
        return interfaceC1234410iEBLJII;
    }

    public C1234530iEN(BaseListFragmentPanel baseListFragmentPanel, C1233510iCj c1233510iCj, String str, User user) {
        this.LIZ = baseListFragmentPanel;
        this.LIZIZ = c1233510iCj;
        this.LIZJ = str;
        this.LIZLLL = user;
        new WeakReference(baseListFragmentPanel.getContext());
    }
}

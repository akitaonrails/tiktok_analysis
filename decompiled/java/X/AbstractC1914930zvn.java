package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.0zvn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1914930zvn implements InterfaceC1915180zwC {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(778));

    @Override // X.InterfaceC1915180zwC
    public void LIZ() {
    }

    @Override // X.InterfaceC1915180zwC
    public void LIZJ(EnumC1876780ywG enumC1876780ywG) {
    }

    @Override // X.InterfaceC1915180zwC
    public void LJ() {
    }

    public abstract InterfaceC1914160zuY LJFF(Context context, CollectConsentParam collectConsentParam);

    @Override // X.InterfaceC1915180zwC
    public void onDismiss() {
    }

    @Override // X.InterfaceC1915180zwC
    public final void onRejected() {
    }

    @Override // X.InterfaceC1915180zwC
    public boolean LIZIZ(EnumC1876780ywG enumC1876780ywG, CollectConsentParam collectConsentParam) {
        return C1914950zvp.LIZ(enumC1876780ywG, collectConsentParam);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0zvl] */
    @Override // X.InterfaceC1915180zwC
    public final void LIZLLL(Context context, final CollectConsentParam collectConsentParam, final C1914970zvr c1914970zvr, final AwS429S0200000_28 awS429S0200000_28, AwS394S0200000_28 awS394S0200000_28, final C1914980zvs c1914980zvs) {
        final ?? r3 = new InterfaceC1914220zue(this, collectConsentParam, c1914970zvr, awS429S0200000_28, c1914980zvs) { // from class: X.0zvl
            public final AbstractC1914930zvn LIZIZ;
            public final CollectConsentParam LIZJ;
            public final Function0<Unit> LIZLLL;
            public final Function0<Unit> LJ;
            public final InterfaceC1631630sYr<String, EnumC1876780ywG, String, String, Unit> LJFF;

            @Override // X.InterfaceC1914220zue
            public final void LIZJ(Boolean bool, String str) {
            }

            @Override // X.InterfaceC1914220zue
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1914220zue
            public final void LIZ(C1519370pdn c1519370pdn) {
                Function0<Unit> function0 = this.LJ;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // X.InterfaceC1914220zue
            public final void LJFF(C1519370pdn c1519370pdn) {
                Function0<Unit> function0 = this.LIZLLL;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // X.InterfaceC1914220zue
            public final void LIZIZ(String str, C1519370pdn c1519370pdn) {
                this.LIZIZ.getClass();
            }

            @Override // X.InterfaceC1914220zue
            public final void LJ(UniversalPopupAction universalPopupAction, C1519370pdn c1519370pdn) {
                C1914270zuj.LIZ.LIZIZ(this.LIZJ, universalPopupAction, c1519370pdn, this.LJFF);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = collectConsentParam;
                this.LIZLLL = c1914970zvr;
                this.LJ = awS429S0200000_28;
                this.LJFF = c1914980zvs;
            }
        };
        Object value = this.LIZ.getValue();
        InterfaceC1914160zuY interfaceC1914160zuYLJFF = LJFF(context, collectConsentParam);
        InterfaceC1519250pdb interfaceC1519250pdb = new InterfaceC1519250pdb() { // from class: X.0zvo
            @Override // X.InterfaceC1519250pdb
            public final InterfaceC1519200pdW LIZ() {
                return null;
            }

            @Override // X.InterfaceC1519250pdb
            public final Map<String, String> LIZIZ() {
                return collectConsentParam.LIZ;
            }

            @Override // X.InterfaceC1519250pdb
            public final InterfaceC1914220zue LIZJ() {
                return r3;
            }
        };
        value.getClass();
        C1914170zuZ.LIZJ(interfaceC1914160zuYLJFF, context, interfaceC1519250pdb);
    }
}

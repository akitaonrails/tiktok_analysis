package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.0FCT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FCT extends C09AY implements InterfaceC1631630sYr<List<? extends Effect>, Boolean, Integer, String, Unit> {
    public final /* synthetic */ C0FCU LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C19754712Qv LLILLL;
    public final /* synthetic */ Effect LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FCT(C0FCU c0fcu, boolean z, C19754712Qv c19754712Qv, Effect effect) {
        super(4);
        this.LL = c0fcu;
        this.LLILLJJLI = z;
        this.LLILLL = c19754712Qv;
        this.LLILZ = effect;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(List<? extends Effect> list, Boolean bool, Integer num, String str) {
        C0EUA c0euaD6;
        List<? extends Effect> list2 = list;
        bool.booleanValue();
        C0FCU c0fcu = this.LL;
        c0fcu.LLJLILLLLZIIL = false;
        if (c0fcu.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            this.LL.i3(AFwS234S0000000_5.get$arr$(182));
            if (num != null) {
                if (this.LLILLJJLI) {
                    this.LL.i3(AFwS234S0000000_5.get$arr$(183));
                }
                this.LL.i3(AFwS234S0000000_5.get$arr$(184));
            }
            ArrayList arrayList = new ArrayList();
            if (list2 != null) {
                C0FCU c0fcu2 = this.LL;
                C19754712Qv c19754712Qv = this.LLILLL;
                for (Effect effect : list2) {
                    if (C1664460tPo.LJFF(effect) && !c0fcu2.W6(effect, c19754712Qv)) {
                        arrayList.add(effect);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                C0E2R c0e2rT4 = this.LL.T4();
                if (c0e2rT4 != null) {
                    c0e2rT4.zs2(true);
                }
                C0E2R c0e2rT42 = this.LL.T4();
                if (c0e2rT42 != null) {
                    c0e2rT42.TC(true);
                }
            }
            this.LL.LLJLL.clear();
            this.LL.LLJLL.addAll(arrayList);
            this.LL.J6().LLLLLJLJLL().LJIIIZ(arrayList, this.LLILLL, this.LLILZ);
            this.LL.H5();
            this.LL.J6().LLLLLJLJLL().LJIIJ();
            if (num == null && !this.LLILLJJLI && (c0euaD6 = this.LL.d6()) != null) {
                c0euaD6.LJII();
            }
        }
        return Unit.LIZ;
    }
}

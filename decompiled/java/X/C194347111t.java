package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.111t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194347111t extends C09AY implements InterfaceC1631630sYr<List<? extends Effect>, Boolean, Integer, String, List<? extends Effect>> {
    public final /* synthetic */ C12QW LL;
    public final /* synthetic */ C19754712Qv LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C194347111t(C12QW c12qw, C19754712Qv c19754712Qv, boolean z) {
        super(4);
        this.LL = c12qw;
        this.LLILLJJLI = c19754712Qv;
        this.LLILLL = z;
    }

    @Override // X.InterfaceC1631630sYr
    public final List<? extends Effect> invoke(List<? extends Effect> list, Boolean bool, Integer num, String str) {
        List<Effect> list2;
        List<? extends Effect> list3 = list;
        if (!bool.booleanValue()) {
            this.LL.getClass();
        }
        if (list3 != null) {
            C12QW c12qw = this.LL;
            C19754712Qv c19754712Qv = this.LLILLJJLI;
            boolean z = this.LLILLL;
            c12qw.LLLIZZ = new ArrayList();
            for (Effect effect : list3) {
                if (!C12QW.LLZIL(effect, c19754712Qv, z) && (list2 = c12qw.LLLIZZ) != null) {
                    ((ArrayList) list2).add(effect);
                }
            }
        }
        return this.LL.LLLIZZ;
    }
}

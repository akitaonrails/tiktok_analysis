package X;

import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0OWJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem$initOriginalLogic$1", f = "BulletinEditAssem.kt", l = {607}, m = "invokeSuspend")
public final class C0OWJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinEditAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OWJ(BulletinEditAssem bulletinEditAssem, InterfaceC1364105Vn<? super C0OWJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinEditAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OWJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        long j;
        Pair<String, String> pair;
        C1C7U.LIZ("BulletinEditAssem@b1d1.initOriginalLogic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str2 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0OWL c0owlMp = this.LLILLJJLI.mp();
            if (c0owlMp != null && (str = c0owlMp.LLILZIL) != null) {
                BulletinEditAssem bulletinEditAssem = this.LLILLJJLI;
                bulletinEditAssem.LLJJJJJIL = str;
                bulletinEditAssem.hp();
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C0OWK c0owk = new C0OWK(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c0owk);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinEditAssem@b1d1.initOriginalLogic$1");
                return objLJFF;
            }
        }
        String str3 = (String) obj;
        if (str3 != null) {
            BulletinEditAssem bulletinEditAssem2 = this.LLILLJJLI;
            C0I7D c0i7d = bulletinEditAssem2.LLJJJIL;
            if (c0i7d != null) {
                c0i7d.setText(str3);
            }
            C0I7D c0i7d2 = bulletinEditAssem2.LLJJJIL;
            if (c0i7d2 != null) {
                c0i7d2.setSelection(str3.length());
            }
        }
        C0I7D c0i7d3 = this.LLILLJJLI.LLJJJIL;
        if (c0i7d3 != null) {
            c0i7d3.setEnabled(true);
        }
        if (str3 != null && !a0.LJJJIL(str3)) {
            str2 = "";
        } else {
            this.LLILLJJLI.op().AQ2(false);
            C0OWL c0owlMp2 = this.LLILLJJLI.mp();
            if (c0owlMp2 != null) {
                str2 = c0owlMp2.LLILZIL;
            }
        }
        C0OWL c0owlMp3 = this.LLILLJJLI.mp();
        if (c0owlMp3 != null && (pair = c0owlMp3.LLJ) != null) {
            BulletinEditAssem bulletinEditAssem3 = this.LLILLJJLI;
            if (str2 != null && str2.length() > 0 && !Intrinsics.LJFF(str2, bulletinEditAssem3.LJJIJL().getContext().getString(2131828120)) && !Intrinsics.LJFF(pair.getFirst(), "topic_from_server")) {
                bulletinEditAssem3.op().LLILZIL.put("topic_text", pair.getFirst());
            }
        }
        C0OPQ c0opq = C0OPQ.LIZ;
        C0OWL c0owlMp4 = this.LLILLJJLI.mp();
        if (c0owlMp4 != null) {
            j = c0owlMp4.LL;
        } else {
            j = 0;
        }
        Map<String, String> map = this.LLILLJJLI.op().LLILZIL;
        c0opq.getClass();
        C0OPQ.LJJIIZI(j, map);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinEditAssem@b1d1.initOriginalLogic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import android.text.format.DateFormat;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C484980J0e extends AbstractC485060J0m<Integer, Object> {
    public final C565700MGq LJFF;
    public final InterfaceC497601wk LJI;
    public final Function1<EnumC485010J0h, Unit> LJII;
    public final Function1<List<OnThisDayTiktokMediaModel>, List<OnThisDayTiktokMediaModel>> LJIIIIZZ;
    public String LJIIIZ;
    public final List<C09AE> LJIIJ = new ArrayList();
    public volatile C09AY LJIIJJI;

    @Override // X.AbstractC485060J0m
    public final void LJIIJJI(C485090J0p c485090J0p) {
        c485090J0p.LIZ(null, C13BV.INSTANCE);
    }

    public final List<Object> LJIILJJIL(List<OnThisDayTiktokMediaModel> list) {
        long j;
        ArrayList arrayList = new ArrayList();
        for (OnThisDayTiktokMediaModel onThisDayTiktokMediaModel : list) {
            ForwardMedia forwardMedia = onThisDayTiktokMediaModel.forwardMedia;
            long j2 = 0;
            if (forwardMedia != null) {
                j = forwardMedia.createTime;
            } else {
                j = 0;
            }
            String str = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "MMM yyyy"), Locale.getDefault()).format(new Date(j * 1000));
            if (!Intrinsics.LJFF(str, this.LJIIIZ)) {
                ForwardMedia forwardMedia2 = onThisDayTiktokMediaModel.forwardMedia;
                if (forwardMedia2 != null) {
                    j2 = forwardMedia2.createTime;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j2 * 1000);
                calendar.set(5, 1);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                arrayList.add(new C0J1F(calendar.getTimeInMillis(), str, str));
                this.LJIIIZ = str;
            }
            arrayList.add(onThisDayTiktokMediaModel);
        }
        return arrayList;
    }

    @Override // X.AbstractC485060J0m
    public final void LJIIJ(C471830Ier<Integer> c471830Ier, AbstractC470790IdB<Integer, Object> abstractC470790IdB) {
        this.LJII.invoke(EnumC485010J0h.RUNNING);
        ((ArrayList) this.LJIIJ).add(C23250099c.LIZLLL(this.LJI, C0PEM.LIZJ, null, new C484990J0f(c471830Ier, this, abstractC470790IdB, null), 2));
    }

    @Override // X.AbstractC485060J0m
    public final void LJIIL(C485050J0l<Integer> c485050J0l, AbstractC470800IdC<Integer, Object> abstractC470800IdC) {
        this.LJII.invoke(EnumC485010J0h.INITIAL_LOADING);
        ((ArrayList) this.LJIIJ).add(C23250099c.LIZLLL(this.LJI, C0PEM.LIZJ, null, new C485000J0g(this, c485050J0l, abstractC470800IdC, null), 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C484980J0e(C565700MGq c565700MGq, InterfaceC497601wk interfaceC497601wk, Function1<? super EnumC485010J0h, Unit> function1, Function1<? super List<OnThisDayTiktokMediaModel>, ? extends List<OnThisDayTiktokMediaModel>> function12) {
        this.LJFF = c565700MGq;
        this.LJI = interfaceC497601wk;
        this.LJII = function1;
        this.LJIIIIZZ = function12;
        LIZIZ(new InterfaceC470920IdO() { // from class: X.0Ipw
            @Override // X.InterfaceC470920IdO
            public final void LIZ() {
                Iterator it2 = ((ArrayList) this.LIZ.LJIIJ).iterator();
                while (it2.hasNext()) {
                    ((C09AE) it2.next()).LIZIZ(null);
                }
                ((ArrayList) this.LIZ.LJIIJ).clear();
                this.LIZ.LJIIJJI = null;
            }
        });
    }
}

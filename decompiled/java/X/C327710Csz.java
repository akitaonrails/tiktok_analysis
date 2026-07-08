package X;

import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Csz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327710Csz extends C03AV {
    public final C0CVI LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final InterfaceC1631630sYr<Long, Long, Long, Long, Unit> LLILZ;
    public AnonymousClass0956 LLILZIL;
    public final HashSet<Long> LLILZLL = new HashSet<>(50);
    public final LinkedBlockingQueue<Long> LLIZ = new LinkedBlockingQueue<>(50);

    public final void LLLFZ(C327610Csp c327610Csp) {
        Iterator<C327630Csr> it2 = c327610Csp.LJIIIZ.iterator();
        while (it2.hasNext()) {
            Iterator<C327670Csv> it3 = it2.next().LLIZLLLIL.iterator();
            while (it3.hasNext()) {
                LLLI(it3.next());
            }
        }
    }

    public final void LLLI(C327670Csv c327670Csv) {
        Long lPoll;
        C327630Csr c327630Csr = c327670Csv.LJFF;
        if (c327630Csr != null && !this.LLILZLL.contains(Long.valueOf(c327630Csr.LLILZIL))) {
            this.LLIZ.offer(Long.valueOf(c327630Csr.LLILZIL));
            this.LLILZLL.add(Long.valueOf(c327630Csr.LLILZIL));
            if (this.LLIZ.size() > 49 && (lPoll = this.LLIZ.poll()) != null) {
                this.LLILZLL.remove(Long.valueOf(lPoll.longValue()));
            }
            this.LLILZ.invoke(Long.valueOf(c327630Csr.LLIZ), Long.valueOf(c327630Csr.LLILZLL), Long.valueOf(this.LLILLJJLI.LIZ()), Long.valueOf(c327630Csr.LLILZIL));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C03AW c03aw = (C03AW) viewHolder;
        StringBuilder sb = new StringBuilder(((C327610Csp) ListProtector.get(this.LL, i)).LIZIZ());
        long jLIZ = this.LLILLJJLI.LIZ();
        C327610Csp c327610Csp = (C327610Csp) ListProtector.get(this.LL, i);
        long j = c327610Csp.LIZJ;
        if (jLIZ < j) {
            TextView textView = c03aw.LL;
            if (textView != null) {
                textView.setText(sb.subSequence(0, sb.length()));
            }
            LLLFZ(c327610Csp);
            return;
        }
        if (jLIZ < j + c327610Csp.LJ && i == getItemCount() - 1) {
            TextView textView2 = c03aw.LL;
            if (textView2 == null) {
                return;
            }
            C0CVI c0cvi = this.LLILLJJLI;
            c327610Csp.LIZJ(jLIZ);
            C327670Csv c327670Csv = c327610Csp.LJI;
            C118300cf c118300cf = new C118300cf();
            int length = c327610Csp.LJFF;
            c118300cf.element = length;
            if (length < 0 || length > sb.length()) {
                length = sb.length();
            }
            textView2.setText(sb.subSequence(0, length));
            if (c327670Csv == null) {
                return;
            }
            this.LLILZIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILLL), null, null, new C327700Csy(c327670Csv, c0cvi, c327610Csp, c118300cf, this, sb, textView2, sb, null), 3);
            return;
        }
        if (jLIZ >= c327610Csp.LIZJ + c327610Csp.LJ) {
            TextView textView3 = c03aw.LL;
            if (textView3 == null) {
                return;
            }
            textView3.setText(sb.subSequence(0, sb.length()));
            LLLFZ(c327610Csp);
            return;
        }
        TextView textView4 = c03aw.LL;
        if (textView4 != null) {
            textView4.setText(sb.subSequence(0, sb.length()));
        }
        LLLFZ(c327610Csp);
    }

    public C327710Csz(C0CVI c0cvi, LifecycleOwner lifecycleOwner, C346570DiJ c346570DiJ) {
        this.LLILLJJLI = c0cvi;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = c346570DiJ;
    }
}

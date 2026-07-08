package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465720IOc extends AbstractC21673619ry<C465730IOd> {
    public final List<Hashtag> LL;
    public Hashtag LLILLJJLI;
    public final Function1<? super Hashtag, Unit> LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Long l;
        int i2;
        C465730IOd c465730IOd = (C465730IOd) viewHolder;
        Hashtag hashtag = (Hashtag) ListProtector.get(this.LL, i);
        Hashtag hashtag2 = this.LLILLJJLI;
        if (hashtag2 != null) {
            l = hashtag2.id;
        } else {
            l = null;
        }
        boolean zLJFF = Intrinsics.LJFF(l, ((Hashtag) ListProtector.get(this.LL, i)).id);
        C465740IOe c465740IOe = new C465740IOe(this);
        C0JSS.LJI(c465730IOd.LL, hashtag.image, R.drawable.du_, 4);
        c465730IOd.LLILLJJLI.setText(hashtag.title);
        c465730IOd.LLILLJJLI.setSelected(zLJFF);
        C16F5 c16f5 = c465730IOd.LLILLJJLI;
        if (zLJFF) {
            i2 = R.style.a91;
        } else {
            i2 = R.style.a8z;
        }
        c16f5.LJJJI(i2);
        C786410Ut5.I7(new ACListenerS111S0200000_7(c465740IOe, hashtag, 66), c465730IOd.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C465730IOd c465730IOd = new C465730IOd(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hhi, viewGroup, false));
        try {
            View view = c465730IOd.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c465730IOd.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c465730IOd.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C465730IOd.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c465730IOd.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c465730IOd.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C465730IOd.class.getName();
        return c465730IOd;
    }

    public C465720IOc(List list, Hashtag hashtag, AwS586S0100000_7 awS586S0100000_7) {
        this.LL = list;
        this.LLILLJJLI = hashtag;
        this.LLILLL = awS586S0100000_7;
    }
}

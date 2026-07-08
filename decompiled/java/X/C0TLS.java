package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS256S0300000_12;

/* JADX INFO: renamed from: X.0TLS, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TLS extends AbstractC21673619ry<C0TLU> {
    public final Context LL;
    public final List<C0TLV> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C0TLS(Context context) {
        this.LL = context;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        C0TLU c0tlu = (C0TLU) viewHolder;
        final C0TLV c0tlv = (C0TLV) ListProtector.get(this.LLILLJJLI, i);
        c0tlu.LL.setTitle(c0tlv.LIZ);
        C127K c127k = c0tlu.LL;
        final AnonymousClass1278 anonymousClass1278 = new AnonymousClass1278(this.LL);
        anonymousClass1278.LJIILJJIL(c0tlv.LIZIZ);
        anonymousClass1278.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.0TLT
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                boolean z2;
                if (anonymousClass1278.LJIILIIL()) {
                    C0TLS c0tls = this;
                    int i2 = i;
                    int i3 = 0;
                    for (Object obj : (ArrayList) c0tls.LLILLJJLI) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            C0TLV c0tlv2 = (C0TLV) obj;
                            if (i3 == i2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c0tlv2.LIZIZ = z2;
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    c0tls.notifyDataSetChanged();
                    AwS256S0300000_12 awS256S0300000_12 = c0tlv.LIZJ;
                    if (awS256S0300000_12 != null) {
                        awS256S0300000_12.invoke();
                    }
                }
            }
        });
        c127k.setAccessory(anonymousClass1278);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0TLU c0tlu = new C0TLU(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.xn, viewGroup, false));
        try {
            View view = c0tlu.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0tlu.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0tlu.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0TLU.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0tlu.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0tlu.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0TLU.class.getName();
        return c0tlu;
    }
}

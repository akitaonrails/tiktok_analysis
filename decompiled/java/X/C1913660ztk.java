package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.KrConsentCheckbox;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS177S1100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;

/* JADX INFO: renamed from: X.0ztk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913660ztk extends AbstractC21673619ry<C1913670ztl> {
    public final List<KrConsentCheckbox> LL;
    public final String LLILLJJLI;
    public final Function2<Boolean, Boolean, Unit> LLILLL;
    public final boolean[] LLILZ;

    public final boolean LLLFZ() {
        for (boolean z : this.LLILZ) {
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final boolean LLLI() {
        int i = 0;
        for (KrConsentCheckbox krConsentCheckbox : this.LL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (!krConsentCheckbox.optional && !this.LLILZ[i]) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        C1913670ztl c1913670ztl = (C1913670ztl) viewHolder;
        KrConsentCheckbox krConsentCheckbox = (KrConsentCheckbox) ListProtector.get(this.LL, i);
        TuxTextView tuxTextView = c1913670ztl.LLILLJJLI;
        String str = krConsentCheckbox.content;
        if (str == null) {
            str = "";
        }
        tuxTextView.setText(str);
        C786410Ut5.D7(c1913670ztl.LL, null);
        c1913670ztl.LL.setChecked(this.LLILZ[i]);
        C786410Ut5.D7(c1913670ztl.LL, new CompoundButton.OnCheckedChangeListener() { // from class: X.0ztj
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C1913660ztk c1913660ztk = this.LL;
                c1913660ztk.LLILZ[i] = z;
                c1913660ztk.LLILLL.invoke(Boolean.valueOf(c1913660ztk.LLLI()), Boolean.valueOf(this.LL.LLLFZ()));
            }
        });
        String str2 = krConsentCheckbox.detailUrl;
        String str3 = krConsentCheckbox.detail;
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            C786410Ut5.LLLLZLL(c1913670ztl.LLILLL, 0);
            c1913670ztl.LLILLL.setMovementMethod(C431260Gvc.LIZ);
            TuxTextView tuxTextView2 = c1913670ztl.LLILLL;
            C444940Hca c444940Hca = new C444940Hca();
            c444940Hca.LIZJ = str3;
            c444940Hca.LIZIZ = true;
            c444940Hca.LIZIZ(51);
            c444940Hca.LIZLLL(2);
            c444940Hca.LJIIIIZZ = new AwS177S1100000_28(this, str2, 9);
            tuxTextView2.setText(c444940Hca.LIZ(c1913670ztl.LLILLL.getContext()));
            return;
        }
        C786410Ut5.LLLLZLL(c1913670ztl.LLILLL, 8);
        c1913670ztl.LLILLL.setMovementMethod(null);
        c1913670ztl.LLILLL.setText("");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1913670ztl c1913670ztl = new C1913670ztl(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.czq, viewGroup, false));
        try {
            View view = c1913670ztl.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1913670ztl.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1913670ztl.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1913670ztl.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1913670ztl.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1913670ztl.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1913670ztl.class.getName();
        return c1913670ztl;
    }

    public C1913660ztk(String str, List list, AwS642S0100000_28 awS642S0100000_28) {
        this.LL = list;
        this.LLILLJJLI = str;
        this.LLILLL = awS642S0100000_28;
        this.LLILZ = new boolean[list.size()];
    }
}

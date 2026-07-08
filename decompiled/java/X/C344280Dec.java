package X;

import Y.ACListenerS108S0200000_4;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344280Dec extends AbstractC21673619ry<C344300Dee> {
    public final Function1<IMContact, Unit> LL;
    public List<? extends IMContact> LLILLJJLI = C13BV.INSTANCE;
    public String LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C344280Dec(Function1<? super IMContact, Unit> function1) {
        this.LL = function1;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SpannableString spannableStringLIZ;
        C344300Dee c344300Dee = (C344300Dee) viewHolder;
        if (i >= 0 && i < this.LLILLJJLI.size()) {
            IMContact iMContact = (IMContact) ListProtector.get(this.LLILLJJLI, i);
            String str = this.LLILLL;
            RemoteImageView remoteImageView = (RemoteImageView) c344300Dee.LLILLL.findViewById(R.id.bir);
            TextView textView = (TextView) c344300Dee.LLILLL.findViewById(R.id.msw);
            C197039127h c197039127h = (C197039127h) c344300Dee.LLILLL.findViewById(R.id.up_);
            if (remoteImageView != null) {
                C1324840ka2.LJFF(remoteImageView, iMContact.getDisplayAvatar());
            }
            if (str != null && str.length() != 0) {
                if (textView != null) {
                    String displayName = iMContact.getDisplayName();
                    if (displayName != null) {
                        spannableStringLIZ = C0DYJ.LIZ(displayName, str);
                    } else {
                        spannableStringLIZ = null;
                    }
                    textView.setText(spannableStringLIZ);
                }
            } else if (textView != null) {
                textView.setText(iMContact.getDisplayName());
            }
            if (c197039127h != null) {
                C786410Ut5.U8(c197039127h, new ACListenerS108S0200000_4(iMContact, c344300Dee, 32));
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C344300Dee c344300Dee = new C344300Dee(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fj2, viewGroup, false), new C344290Ded(this));
        try {
            View view = c344300Dee.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c344300Dee.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c344300Dee.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C344300Dee.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c344300Dee.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c344300Dee.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C344300Dee.class.getName();
        return c344300Dee;
    }
}

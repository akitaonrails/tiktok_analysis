package X;

import Y.ACListenerS110S0200000_6;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.social.sticker.model.SocialEmoji;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0H4L, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H4L extends AbstractC21673619ry<C0H4M> {
    public final List<SocialEmoji> LL;
    public final Function1<SocialEmoji, Unit> LLILLJJLI;
    public final Function0<Unit> LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0H4M c0h4m = (C0H4M) viewHolder;
        SocialEmoji socialEmoji = (SocialEmoji) C13LP.LJJJLZIJ(i, this.LL);
        if (socialEmoji != null) {
            c0h4m.LL.setImageBitmap(C0GZ1.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), socialEmoji.emoji));
            C786410Ut5.I7(new ACListenerS110S0200000_6(this, socialEmoji, 29), c0h4m.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ImageView imageView;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c3z, viewGroup, false);
        if (!(viewTd instanceof ImageView) || (imageView = (ImageView) viewTd) == null) {
            imageView = new ImageView(viewGroup.getContext());
        }
        C0H4M c0h4m = new C0H4M(imageView);
        try {
            View view = c0h4m.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0h4m.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0h4m.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0H4M.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0h4m.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0h4m.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0H4M.class.getName();
        return c0h4m;
    }

    public C0H4L(List list, C1892010zKp c1892010zKp, C1892030zKr c1892030zKr) {
        this.LL = list;
        this.LLILLJJLI = c1892010zKp;
        this.LLILLL = c1892030zKr;
    }
}

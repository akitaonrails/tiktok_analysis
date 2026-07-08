package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.photomode.GenItem;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0DTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339820DTw extends AbstractC21673619ry<C339810DTv> {
    public final VideoPublishEditModel LL;
    public List<GenItem> LLILLJJLI = new ArrayList(15);
    public InterfaceC339840DTy LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C339820DTw(VideoPublishEditModel videoPublishEditModel) {
        this.LL = videoPublishEditModel;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final C339810DTv c339810DTv = (C339810DTv) viewHolder;
        c339810DTv.LLILLJJLI.setText(((GenItem) ListProtector.get(this.LLILLJJLI, i)).text);
        C786410Ut5.I7(new C19IN() { // from class: X.0DTx
            @Override // X.C19IN
            public final void LIZ(View view) {
                InterfaceC339840DTy interfaceC339840DTy;
                InterfaceC339840DTy interfaceC339840DTy2;
                if (c339810DTv.getBindingAdapterPosition() >= 0 && c339810DTv.getBindingAdapterPosition() < ((ArrayList) this.LLILLJJLI).size()) {
                    GenItem genItem = (GenItem) C13LP.LJJJLZIJ(c339810DTv.getBindingAdapterPosition(), this.LLILLJJLI);
                    if (genItem != null && (interfaceC339840DTy2 = this.LLILLL) != null) {
                        interfaceC339840DTy2.LIZJ(genItem);
                    }
                    if (!C855980Xi0.LIZIZ(this.LL)) {
                        C339820DTw c339820DTw = this;
                        int bindingAdapterPosition = c339810DTv.getBindingAdapterPosition();
                        ListProtector.remove(c339820DTw.LLILLJJLI, bindingAdapterPosition);
                        c339820DTw.notifyItemRemoved(bindingAdapterPosition);
                        InterfaceC339840DTy interfaceC339840DTy3 = c339820DTw.LLILLL;
                        if (interfaceC339840DTy3 != null) {
                            interfaceC339840DTy3.LIZIZ(c339820DTw.LLILLJJLI);
                        }
                        if (((ArrayList) c339820DTw.LLILLJJLI).isEmpty() && (interfaceC339840DTy = c339820DTw.LLILLL) != null) {
                            interfaceC339840DTy.LIZ();
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(600, true);
            }
        }, c339810DTv.LLILLJJLI);
        InterfaceC339840DTy interfaceC339840DTy = this.LLILLL;
        if (interfaceC339840DTy != null) {
            interfaceC339840DTy.LIZLLL((GenItem) ListProtector.get(this.LLILLJJLI, i));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C339810DTv c339810DTv = new C339810DTv((FrameLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cyi, viewGroup, false));
        try {
            View view = c339810DTv.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c339810DTv.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c339810DTv.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C339810DTv.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c339810DTv.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c339810DTv.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C339810DTv.class.getName();
        return c339810DTv;
    }
}

package X;

import Y.ACListenerS116S0200000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Til, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C754530Til extends AbstractC21673619ry<C754540Tim> {
    public final InterfaceC754550Tin LL;
    public final List<C954460awe> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C754530Til(InterfaceC754550Tin interfaceC754550Tin) {
        this.LL = interfaceC754550Tin;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        ImageModel imageModel;
        String str;
        C754540Tim c754540Tim = (C754540Tim) viewHolder;
        if (((ArrayList) this.LLILLJJLI).size() > i) {
            C954460awe c954460awe = (C954460awe) ListProtector.get(this.LLILLJJLI, i);
            if (c754540Tim.LLILZ.LL.Hj().size() >= ((ArrayList) c754540Tim.LLILZ.LLILLJJLI).size() - 1) {
                z = true;
            } else {
                z = false;
            }
            float f = 1.0f;
            if (c754540Tim.LLILZ.LL.Hj().isEmpty()) {
                c754540Tim.itemView.setBackgroundResource(R.drawable.dzi);
                c754540Tim.LLILLL.setChecked(false);
                C786410Ut5.T4(c754540Tim.itemView, 1.0f);
            } else {
                List<C954460awe> listHj = c754540Tim.LLILZ.LL.Hj();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listHj, 10));
                Iterator<C954460awe> it2 = listHj.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(it2.next().LJ));
                }
                if (!arrayList.contains(Long.valueOf(c954460awe.LJ))) {
                    c754540Tim.itemView.setBackgroundResource(R.drawable.dzi);
                    c754540Tim.LLILLL.setChecked(false);
                    View view = c754540Tim.itemView;
                    if (z) {
                        f = 0.4f;
                    }
                    C786410Ut5.T4(view, f);
                } else {
                    c754540Tim.itemView.setBackgroundResource(R.drawable.dzj);
                    c754540Tim.LLILLL.setChecked(true);
                    C786410Ut5.T4(c754540Tim.itemView, 1.0f);
                }
            }
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            C754570Tip c754570Tip = c954460awe.LJIJJ;
            String str2 = null;
            if (c754570Tip != null) {
                imageModel = c754570Tip.LIZJ;
            } else {
                imageModel = null;
            }
            C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
            int width = c754540Tim.LL.getWidth();
            int height = c754540Tim.LL.getHeight();
            c1324610kZfLJIIIZ.LJ = width;
            c1324610kZfLJIIIZ.LJFF = height;
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJJI(c754540Tim.LL);
            C16F5 c16f5 = c754540Tim.LLILLJJLI;
            C754570Tip c754570Tip2 = c954460awe.LJIJJ;
            if (c754570Tip2 != null) {
                str = c754570Tip2.LIZ;
                str2 = c754570Tip2.LIZIZ;
            } else {
                str = null;
            }
            c16f5.setText(C0KVU.LIZIZ(str, str2));
            C786410Ut5.I7(new ACListenerS116S0200000_12(c754540Tim.LLILZ, c954460awe, 49), c754540Tim.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iLIZIZ;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gvr, viewGroup, false);
        if (((ArrayList) this.LLILLJJLI).size() == 2) {
            iLIZIZ = (C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(40.0f))) / 2;
        } else {
            iLIZIZ = (int) C497740JfY.LIZIZ(148.0f);
        }
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = iLIZIZ;
            C786410Ut5.W5(viewTd, layoutParams);
        } else {
            C786410Ut5.W5(viewTd, new RecyclerView.LayoutParams(iLIZIZ, (int) C497740JfY.LIZIZ(40.0f)));
        }
        C754540Tim c754540Tim = new C754540Tim(this, viewTd);
        try {
            View view = c754540Tim.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c754540Tim.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c754540Tim.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C754540Tim.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c754540Tim.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c754540Tim.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C754540Tim.class.getName();
        return c754540Tim;
    }
}

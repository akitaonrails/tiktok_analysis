package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0lhD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1367730lhD extends AbstractC1368060lhk implements SectionIndexer {
    public SectionIndexer LLJILJILJ;
    public final C1367750lhF LLJILLL = new C1367750lhF();

    @Override // X.AbstractC1368060lhk, X.AbstractC21673619ry
    public final int getItemCount() {
        List<IMContact> list = this.LLILLL;
        if (list != null) {
            return ((ArrayList) list).size();
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public final Object[] getSections() {
        SectionIndexer sectionIndexer = this.LLJILJILJ;
        return sectionIndexer != null ? sectionIndexer.getSections() : new String[]{" "};
    }

    @Override // X.AbstractC1368060lhk
    public final String LLLFZ(IMContact iMContact) {
        IMUser iMUserLIZ = C903150Zbt.LIZ(iMContact);
        if (iMUserLIZ != null) {
            if (!TextUtils.isEmpty(iMUserLIZ.getRemarkName()) && !TextUtils.isEmpty(iMUserLIZ.getNickName())) {
                return C2213981Bky.LIZIZ.getApplicationContext().getString(2131835750, iMUserLIZ.getNickName());
            }
            return iMUserLIZ.getSignature();
        }
        return null;
    }

    public final C1367750lhF LLLJIL(int i) {
        C1367750lhF c1367750lhF = this.LLJILLL;
        if (c1367750lhF.LIZ == i) {
            return c1367750lhF;
        }
        c1367750lhF.LIZ = i;
        int sectionForPosition = getSectionForPosition(i);
        if (sectionForPosition != -1 && getPositionForSection(sectionForPosition) == i) {
            this.LLJILLL.getClass();
            this.LLJILLL.LIZIZ = (String) getSections()[sectionForPosition];
        } else {
            this.LLJILLL.getClass();
            this.LLJILLL.LIZIZ = null;
        }
        C1367750lhF c1367750lhF2 = this.LLJILLL;
        getPositionForSection(sectionForPosition + 1);
        c1367750lhF2.getClass();
        return this.LLJILLL;
    }

    @Override // X.AbstractC1368060lhk, X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i < 0) {
            return 1;
        }
        return super.getItemViewType(i);
    }

    @Override // android.widget.SectionIndexer
    public final int getPositionForSection(int i) {
        SectionIndexer sectionIndexer = this.LLJILJILJ;
        if (sectionIndexer != null) {
            return sectionIndexer.getPositionForSection(i);
        }
        return -1;
    }

    @Override // android.widget.SectionIndexer
    public final int getSectionForPosition(int i) {
        SectionIndexer sectionIndexer = this.LLJILJILJ;
        if (sectionIndexer != null) {
            return sectionIndexer.getSectionForPosition(i);
        }
        return -1;
    }

    @Override // X.AbstractC1368060lhk
    /* JADX INFO: renamed from: LLLIIIIL */
    public final void onBindViewHolder(C1368080lhm c1368080lhm, int i) {
        if (i < 0) {
            return;
        }
        c1368080lhm.I5(i, (IMContact) ListProtector.get(this.LLILLL, i));
    }

    @Override // X.AbstractC1368060lhk
    public C1368080lhm LLLIILIL(int i, ViewGroup viewGroup) {
        return new C1368080lhm(this) { // from class: X.0lhE
            {
                super(this, null);
            }
        };
    }

    @Override // X.AbstractC1368060lhk, X.AbstractC21673619ry
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((C1368080lhm) viewHolder, i);
    }

    @Override // X.AbstractC1368060lhk, X.AbstractC21673619ry
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1368080lhm c1368080lhmLLLIILIL = LLLIILIL(i, viewGroup);
        if (c1368080lhmLLLIILIL != null) {
            try {
                View view = c1368080lhmLLLIILIL.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        c1368080lhmLLLIILIL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1368080lhmLLLIILIL.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1368080lhmLLLIILIL.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1368080lhmLLLIILIL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1368080lhmLLLIILIL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1368080lhmLLLIILIL.getClass().getName();
        return c1368080lhmLLLIILIL;
    }
}

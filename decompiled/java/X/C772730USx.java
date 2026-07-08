package X;

import Y.ACListenerS116S0200000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.game.broadcast.speeddetector.GamePreparationDefinitionDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerGameSettings;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0USx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772730USx extends AbstractC21673619ry<C772750USz> {
    public final RecyclerView LL;
    public List<C772740USy> LLILLJJLI;
    public final DataChannel LLILLL;
    public final C0UT0 LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public final /* synthetic */ GamePreparationDefinitionDialog LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C772750USz c772750USz = (C772750USz) viewHolder;
        C772740USy c772740USy = (C772740USy) ListProtector.get(this.LLILLJJLI, i);
        c772750USz.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        C20744016Fi c20744016Fi = c772750USz.LLILZIL;
        if (c20744016Fi != null) {
            c20744016Fi.setClickable(false);
        }
        C16F5 c16f5 = c772750USz.LLILLJJLI;
        if (c16f5 != null) {
            c16f5.setText(c772740USy.LIZ);
        }
        C16F5 c16f52 = c772750USz.LLILLL;
        if (c16f52 != null) {
            String str = c772740USy.LIZIZ;
            if (str == null) {
                str = "";
            }
            c16f52.setText(str);
        }
        C20744016Fi c20744016Fi2 = c772750USz.LLILZIL;
        if (c20744016Fi2 != null) {
            c20744016Fi2.setChecked(c772740USy.LIZLLL);
        }
        ConstraintLayout constraintLayout = c772750USz.LL;
        if (constraintLayout != null) {
            constraintLayout.setSelected(c772740USy.LIZLLL);
        }
        C16F5 c16f53 = c772750USz.LLILLJJLI;
        if (c16f53 != null) {
            c16f53.setSelected(c772740USy.LIZLLL);
        }
        c772750USz.LLILZLL.getClass();
        if (TTLHVideoQualityStrategyManagerGameSettings.INSTANCE.enabledStrategyCenter() && c772740USy.LJ) {
            C16F5 c16f54 = c772750USz.LLILZ;
            if (c16f54 != null) {
                C786410Ut5.LLJJJJ(c16f54, 0);
            }
        } else {
            C16F5 c16f55 = c772750USz.LLILZ;
            if (c16f55 != null) {
                C786410Ut5.LLJJJJ(c16f55, 8);
            }
        }
        C786410Ut5.I7(new ACListenerS116S0200000_12(this, c772750USz, 29), c772750USz.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C772750USz c772750USz = new C772750USz(this.LLIZ, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g6y, viewGroup, false));
        try {
            View view = c772750USz.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c772750USz.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c772750USz.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C772750USz.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c772750USz.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c772750USz.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C772750USz.class.getName();
        return c772750USz;
    }

    public C772730USx(GamePreparationDefinitionDialog gamePreparationDefinitionDialog, RecyclerView recyclerView, List<C772740USy> list, DataChannel dataChannel, C0UT0 c0ut0) {
        this.LLIZ = gamePreparationDefinitionDialog;
        this.LL = recyclerView;
        this.LLILLJJLI = list;
        this.LLILLL = dataChannel;
        this.LLILZ = c0ut0;
        int size = ((ArrayList) list).size();
        for (int i = 0; i < size; i++) {
            if (((C772740USy) ListProtector.get(this.LLILLJJLI, i)).LIZLLL) {
                this.LLILZIL = i;
                return;
            }
        }
    }
}

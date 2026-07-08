package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380070EvF extends AbstractC21673619ry<C380090EvH> {
    public final Context LL;
    public final C380080EvG LLILLJJLI;
    public List<EditorProAIGCMediaItemModel> LLILLL = C13BV.INSTANCE;
    public String LLILZ = "";
    public EnumC378720Et4 LLILZIL = EnumC378720Et4.NONE;
    public Integer LLILZLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.isEmpty() ? this.LLILZIL == EnumC378720Et4.TEXT_TO_VIDEO_RESULT ? 1 : 4 : this.LLILLL.size();
    }

    public C380070EvF(Context context, C380080EvG c380080EvG) {
        this.LL = context;
        this.LLILLJJLI = c380080EvG;
    }

    public final void LLLFZ(int i, boolean z) {
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LLILLL);
        this.LLILZLL = Integer.valueOf(i);
        notifyDataSetChanged();
        MutableLiveData<Pair<EditorProAIGCMediaItemModel, Boolean>> event = this.LLILLJJLI.getEvent();
        if (event != null) {
            event.setValue(new Pair<>(objLJJJLZIJ, Boolean.valueOf(z)));
        }
        if (i > -1) {
            this.LLILLJJLI.scrollToPosition(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r10, int r11) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380070EvF.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bzi, viewGroup, false);
        C380090EvH c380090EvH = new C380090EvH(viewTd, (ConstraintLayout) viewTd.findViewById(R.id.l33), (SmartImageView) viewTd.findViewById(R.id.l2v), viewTd.findViewById(R.id.l2z), (TuxIconView) viewTd.findViewById(R.id.l2x), (C1295960jpS) viewTd.findViewById(R.id.l2y), viewTd.findViewById(R.id.l32), (TuxTextView) viewTd.findViewById(R.id.l31));
        try {
            View view = c380090EvH.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c380090EvH.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c380090EvH.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C380090EvH.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c380090EvH.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c380090EvH.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C380090EvH.class.getName();
        return c380090EvH;
    }
}

package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS100S0201000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo;

/* JADX INFO: renamed from: X.0bNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971260bNk extends AbstractC21673619ry<C971320bNq> {
    public List<C970190bM1> LL;
    public final C953100auS LLILLJJLI;
    public final Function1<C953770avX, Unit> LLILLL;
    public long LLILZ = -1;
    public EnumC155700ih LLILZIL = EnumC155700ih.FINISHED;
    public final HashSet<Long> LLILZLL = new HashSet<>();
    public final C971270bNl LLIZ = new InterfaceC915550Zvt() { // from class: X.0bNl
        @Override // X.InterfaceC915550Zvt
        public final void LIZ(Throwable th) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onclick, TemplateDraftCallback failed，throwable: ");
            sbLIZ.append(th);
            C20441214yg.LJIIL("TemplateQuickSelectAdapter_Noticeboard", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC915550Zvt
        public final void LIZIZ(C953770avX c953770avX) {
            C20441214yg.LIZIZ("TemplateQuickSelectAdapter_Noticeboard", "onclick, TemplateDraftCallback success, set loading ui finished");
            C971260bNk c971260bNk = this.LIZ;
            c971260bNk.LLILZIL = EnumC155700ih.FINISHED;
            Iterator<C970190bM1> it2 = c971260bNk.LL.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().LIZ.noticeboardTemplateId == c971260bNk.LLILZ) {
                    if (i >= 0) {
                        this.LIZ.notifyItemChanged(i, new Object());
                    }
                } else {
                    i++;
                }
            }
            this.LIZ.LLILLL.invoke(c953770avX);
        }
    };

    public final int LLLFZ() {
        Iterator<C970190bM1> it2 = this.LL.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().LIZ.noticeboardTemplateId == this.LLILZ) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLI, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C971320bNq c971320bNq, int i) {
        String str;
        if (this.LL.size() <= i) {
            return;
        }
        C970190bM1 c970190bM1 = (C970190bM1) ListProtector.get(this.LL, i);
        if (!this.LLILZLL.contains(Long.valueOf(c970190bM1.LIZ.noticeboardTemplateId))) {
            EnumC971520bOA enumC971520bOA = EnumC971520bOA.SHOW;
            Long lValueOf = Long.valueOf(c970190bM1.LIZ.noticeboardTemplateId);
            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
            EnumC952890au7 enumC952890au7 = this.LLILLJJLI.LIZJ;
            multiCanvasUtils.getClass();
            C946850akN.LJIIIZ(enumC971520bOA, lValueOf, "shortcut", MultiCanvasUtils.LJIIJJI(enumC952890au7), "in_spots");
            this.LLILZLL.add(Long.valueOf(c970190bM1.LIZ.noticeboardTemplateId));
        }
        ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo = c970190bM1.LIZ.convertNoticeboardMaterialInfo;
        if (convertNoticeboardMaterialInfo != null && (str = convertNoticeboardMaterialInfo.thumbCoverImageUrl) != null) {
            C1324610kZf c1324610kZfLIZJ = c971320bNq.LL.LIZJ(Collections.singletonList(str));
            c1324610kZfLIZJ.LJJIFFI = true;
            c1324610kZfLIZJ.LJIIL = new C987140bnM(c971320bNq, 2);
            c1324610kZfLIZJ.LJJI(c971320bNq.LLILLJJLI);
        }
        if (i == LLLFZ()) {
            if (this.LLILZIL == EnumC155700ih.LOADING) {
                C12ES.LJIILL(0, c971320bNq.LLILZIL);
                C12ES.LJIILL(0, c971320bNq.LLILZLL);
            } else {
                C439101nJ.LJI(c971320bNq.LLILZIL);
                C439101nJ.LJI(c971320bNq.LLILZLL);
            }
            ViewGroup.LayoutParams layoutParams = c971320bNq.LLILZ.getLayoutParams();
            layoutParams.width = (int) C497740JfY.LIZIZ(66.0f);
            layoutParams.height = (int) C497740JfY.LIZIZ(66.0f);
            C786410Ut5.W5(c971320bNq.LLILZ, layoutParams);
            c971320bNq.LLILZ.setBackgroundResource(R.drawable.djb);
        } else {
            ViewGroup.LayoutParams layoutParams2 = c971320bNq.LLILZ.getLayoutParams();
            layoutParams2.width = (int) C497740JfY.LIZIZ(64.0f);
            layoutParams2.height = (int) C497740JfY.LIZIZ(64.0f);
            C786410Ut5.W5(c971320bNq.LLILZ, layoutParams2);
            c971320bNq.LLILZ.setBackgroundResource(R.drawable.djc);
            C439101nJ.LJI(c971320bNq.LLILZIL);
            C439101nJ.LJI(c971320bNq.LLILZLL);
        }
        C500260Jjc.LJLIIIL(500L, c971320bNq.itemView, new AwS100S0201000_15(this, i, c970190bM1, 0));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C971320bNq c971320bNq = new C971320bNq(C786410Ut5.Td(C972080bP4.LIZ(C786410Ut5.ne(viewGroup.getContext())), R.layout.fxl, viewGroup, false));
        try {
            View view = c971320bNq.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c971320bNq.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c971320bNq.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C971320bNq.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c971320bNq.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c971320bNq.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C971320bNq.class.getName();
        return c971320bNq;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0bNl] */
    public C971260bNk(List list, C953100auS c953100auS, AwS594S0100000_15 awS594S0100000_15) {
        this.LL = list;
        this.LLILLJJLI = c953100auS;
        this.LLILLL = awS594S0100000_15;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C971320bNq c971320bNq = (C971320bNq) viewHolder;
        if (list.isEmpty()) {
            super.onBindViewHolder(c971320bNq, i, list);
        } else {
            onBindViewHolder(c971320bNq, i);
        }
    }
}

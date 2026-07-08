package X;

import Y.ARunnableS81S0200000_12;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.livesdk.billboard.broadcast.BillboardMultiDeleteConfirmSheetFragment;
import com.bytedance.android.livesdk.billboard.ui.page.BasicPageVH;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS418S0200000_17;
import webcast.data.host_board.HostBoard;

/* JADX INFO: renamed from: X.0epq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104000epq extends AbstractC21673619ry<C0TK2> {
    public final List<C2757014x> LL;
    public final Function1<Integer, Unit> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C0TK2 c0tk2 = (C0TK2) viewHolder;
        super.onViewRecycled(c0tk2);
        c0tk2.LLILZIL = null;
        ObjectAnimator objectAnimator = c0tk2.LLILZLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        c0tk2.LLILZLL = null;
        c0tk2.LLILZ.animate().cancel();
        c0tk2.itemView.animate().cancel();
        C786410Ut5.Ob(c0tk2.itemView, 1.0f);
        C786410Ut5.pc(c0tk2.itemView, 1.0f);
    }

    public C1104000epq(List list, AnonymousClass0131 anonymousClass0131) {
        this.LL = list;
        this.LLILLJJLI = anonymousClass0131;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final C0TK2 c0tk2 = (C0TK2) viewHolder;
        final C2757014x c2757014x = (C2757014x) ListProtector.get(this.LL, i);
        final AwS418S0200000_17 awS418S0200000_17 = new AwS418S0200000_17(c0tk2, this, 8);
        c0tk2.LLILZIL = c2757014x;
        C786410Ut5.Ob(c0tk2.LLILZ, 0.0f);
        C786410Ut5.pc(c0tk2.LLILZ, 0.0f);
        C786410Ut5.Ab(c0tk2.itemView, 0.0f);
        c0tk2.itemView.animate().cancel();
        C786410Ut5.Ob(c0tk2.itemView, 1.0f);
        C786410Ut5.pc(c0tk2.itemView, 1.0f);
        ObjectAnimator objectAnimator = c0tk2.LLILZLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        c0tk2.LLILZLL = null;
        c0tk2.LLILZ.animate().cancel();
        c0tk2.LLILZ.animate().setStartDelay(350L).setDuration(120L).setInterpolator(C1619980sG4.LIZLLL()).withEndAction(new ARunnableS81S0200000_12(c2757014x, c0tk2, 26)).scaleX(1.0f).scaleY(1.0f).start();
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.010y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HostBoard hostBoard = c2757014x.LIZ;
                if (hostBoard.boardInfo == null && !hostBoard.nonDeletable) {
                    ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).rN2(c2757014x.LIZ.boardId, C011V.BROADCAST, 0L);
                    awS418S0200000_17.invoke();
                } else {
                    String str = BillboardMultiDeleteConfirmSheetFragment._pnsPageId;
                    Context context = c0tk2.itemView.getContext();
                    C2757014x c2757014x2 = c2757014x;
                    C01GH.LIZIZ(context, c2757014x2, new C020Y(c2757014x2, (C2757014x) awS418S0200000_17, (Function0<Unit>) 19));
                }
            }
        }, c0tk2.LLILZ);
        FrameLayout frameLayout = c0tk2.LL;
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZ = C418440Gaw.LIZIZ(16);
        c19659111vp.LIZIZ = 0.0f;
        c19659111vp.LIZJ = C418440Gaw.LIZIZ(6);
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(25);
        c19659111vp.LJ = Integer.valueOf(R.attr.exi);
        frameLayout.setBackground(c19659111vp.LIZ(c0tk2.itemView.getContext()));
        C500260Jjc.LJIILIIL(c0tk2.LLILLL);
        c0tk2.LLILLL.setImageCheckBitmap(null);
        C500260Jjc.LJIILIIL(c0tk2.LLILLJJLI);
        C786410Ut5.LJJJJIZL(c0tk2.LLILLJJLI);
        AnonymousClass0151 anonymousClass0151 = c2757014x.LIZIZ;
        if (anonymousClass0151 != null) {
            View viewLIZ = anonymousClass0151.LIZ(c0tk2.LLILLL.getContext());
            if (viewLIZ.getWidth() > 0 && viewLIZ.getHeight() > 0) {
                C500260Jjc.LLFFF(c0tk2.LLILLL);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewLIZ.getWidth(), viewLIZ.getHeight(), Bitmap.Config.ARGB_8888);
                C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), viewLIZ);
                c0tk2.LLILLL.setImageCheckBitmap(bitmapCreateBitmap);
                return;
            }
            return;
        }
        C500260Jjc.LLFFF(c0tk2.LLILLJJLI);
        final Context context = c0tk2.LLILLJJLI.getContext();
        FrameLayout frameLayout2 = new FrameLayout(context) { // from class: X.0epr
            @Override // android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return true;
            }
        };
        int i2 = BasicPageVH.LLIZ;
        BasicPageVH basicPageVH = new BasicPageVH(C786410Ut5.Td(C786410Ut5.ne(frameLayout2.getContext()), R.layout.g08, frameLayout2, false), null);
        basicPageVH.I5(c2757014x, 0);
        frameLayout2.addView(basicPageVH.itemView);
        c0tk2.LLILLJJLI.addView(frameLayout2);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0TK2 c0tk2 = new C0TK2(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g04, viewGroup, false));
        try {
            View view = c0tk2.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0tk2.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0tk2.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0TK2.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0tk2.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0tk2.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0TK2.class.getName();
        return c0tk2;
    }
}

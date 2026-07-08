package X;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gbG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ViewOnTouchListenerC1171840gbG implements View.OnTouchListener {
    public boolean LL;
    public final RunnableC733760SqM LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SqM] */
    public ViewOnTouchListenerC1171840gbG(C731840SnG c731840SnG, final C0O1H c0o1h) {
        this.LLILLL = c731840SnG;
        this.LLILLJJLI = new Runnable() { // from class: X.0SqM
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("QuickFavoriteManager@2914.getQuickFavoriteOnTouchDelegate$1$action$1");
                try {
                    this.LL.LL = true;
                    Function0<Unit> function0 = c0o1h;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("QuickFavoriteManager@2914.getQuickFavoriteOnTouchDelegate$1$action$1");
            }
        };
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view == null || motionEvent == null) {
            return false;
        }
        Function0<Unit> function0 = this.LLILLL;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    HandlerHook.viewRemoveCallbacks(view, this.LLILLJJLI);
                }
            } else {
                HandlerHook.viewRemoveCallbacks(view, this.LLILLJJLI);
                if (!this.LL && function0 != null) {
                    function0.invoke();
                }
            }
        } else {
            this.LL = false;
            if (((Number) C296230BjJ.LIZ.getValue()).intValue() != 0 && ((Number) C259950AGr.LIZ.getValue()).intValue() != 0) {
                C1171460gae.LIZ.getClass();
                try {
                    new C1171340gaS().LLILLL.u0(0L, null, true, null, null, true, false, true).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0H66
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            List listLL;
                            String str;
                            UrlModel urlModel;
                            List<String> urlList;
                            C1C7U.LIZ("QuickFavoriteManager@2914.preloadCollectionCovers$1");
                            List<CollectionDetail> list = ((CollectionListResponse) obj).items;
                            if (list != null && (listLL = C13LP.LL(list, 3)) != null) {
                                Iterator it2 = listLL.iterator();
                                while (it2.hasNext()) {
                                    List<UrlModel> list2 = ((CollectionDetail) it2.next()).covers;
                                    if (list2 == null || (urlModel = (UrlModel) C13LP.LJJJLZIJ(0, list2)) == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
                                        str = "";
                                    }
                                    C1331660kl2.LJIIIZ(str).LJIILIIL();
                                }
                            }
                            C1C7U.LIZIZ("QuickFavoriteManager@2914.preloadCollectionCovers$1");
                        }
                    }, new C09JN() { // from class: X.00O4
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("QuickFavoriteManager@2914.preloadCollectionCovers$2");
                            C1C7U.LIZIZ("QuickFavoriteManager@2914.preloadCollectionCovers$2");
                        }
                    });
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            HandlerHook.viewPostDelay(view, this.LLILLJJLI, 200L);
        }
        AbstractDialogC1171850gbH abstractDialogC1171850gbH = C1171460gae.LIZIZ;
        if (abstractDialogC1171850gbH == null || !abstractDialogC1171850gbH.isShowing()) {
            return false;
        }
        return abstractDialogC1171850gbH.s1(motionEvent, view);
    }
}

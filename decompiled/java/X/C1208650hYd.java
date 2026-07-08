package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiReviewReadEntranceAssem;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.List;

/* JADX INFO: renamed from: X.0hYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208650hYd extends C0DXR {
    public final int $t;
    public Object l0;

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, rect, view, recyclerView, c21673919s1);
                break;
            case 1:
                LIZIZ$1(this, rect, view, recyclerView, c21673919s1);
                break;
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    public C1208650hYd(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(C1208650hYd c1208650hYd, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i2 = 0;
        if (childAdapterPosition == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
            C786410Ut5.W5(view, marginLayoutParams);
            return;
        }
        if (childAdapterPosition == ((C1169380gXI) c1208650hYd.l0).LLJILJILJ.getState().LJIIIIZZ() - 1) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (((C1169380gXI) c1208650hYd.l0).LLILLL) {
                i2 = C1169380gXI.LLJJJJ;
            } else if (!C268330AfP.LJI()) {
                i2 = C1169380gXI.LLJJJIL;
            }
            marginLayoutParams2.setMarginStart(i2);
            marginLayoutParams2.setMarginEnd(((C1169380gXI) c1208650hYd.l0).LLJI);
            C786410Ut5.W5(view, marginLayoutParams2);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (((C1169380gXI) c1208650hYd.l0).LLILLL) {
            i = C1169380gXI.LLJJJJ;
        } else if (C268330AfP.LJI()) {
            i = 0;
        } else {
            i = C1169380gXI.LLJJJIL;
        }
        marginLayoutParams3.setMarginStart(i);
        marginLayoutParams3.setMarginEnd(0);
        C786410Ut5.W5(view, marginLayoutParams3);
    }

    public static final void LIZIZ$1(C1208650hYd c1208650hYd, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        InterfaceC1891350zJl interfaceC1891350zJl;
        PoiReviewsApi.PoiReviewModel poiReviewModel;
        PoiReviewsApi.PoiReviewUserModel author;
        PoiReviewsApi.PoiUserReviewModel poiUserReviewModel;
        List<InterfaceC1891350zJl> listItems;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int bindingAdapterPosition = recyclerView.getChildViewHolder(view).getBindingAdapterPosition();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((PoiReviewReadEntranceAssem) c1208650hYd.l0).LLJJIJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (listItems = viewOnAttachStateChangeListenerC20604515jv.getListItems()) != null) {
            interfaceC1891350zJl = (InterfaceC1891350zJl) C13LP.LJJJLZIJ(bindingAdapterPosition, listItems);
        } else {
            interfaceC1891350zJl = null;
        }
        if (interfaceC1891350zJl instanceof PoiReviewsApi.PoiReviewModel) {
            poiReviewModel = (PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl;
        } else {
            poiReviewModel = null;
        }
        ((PoiReviewReadEntranceAssem) c1208650hYd.l0).ip();
        if (bindingAdapterPosition + 1 == 1) {
            if (poiReviewModel != null && (author = poiReviewModel.getAuthor()) != null && (poiUserReviewModel = author.userReviewProfileFrame) != null && poiUserReviewModel.badgeUrl != null) {
                rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                return;
            } else {
                rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                return;
            }
        }
        rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }
}

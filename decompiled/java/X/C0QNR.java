package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchIntermediateViewModelNew;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QNR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QNR implements C0QNT {
    public final /* synthetic */ C0QNQ LIZ;
    public final /* synthetic */ InterfaceC668720QKw LIZIZ;

    @Override // X.C0QNT
    public final void LIZ(MotionEvent motionEvent) {
        InterfaceC668720QKw interfaceC668720QKw;
        C0QNU c0qnuLIZLLL;
        if (motionEvent == null) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        this.LIZ.getClass();
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = null;
        if (C0QGV.LIZ()) {
            SearchIntermediateViewModelNew searchIntermediateViewModelNew2 = this.LIZ.LL;
            if (searchIntermediateViewModelNew2 == null) {
                searchIntermediateViewModelNew2 = null;
            }
            if (Intrinsics.LJFF(searchIntermediateViewModelNew2.LLIZ, Boolean.TRUE)) {
                C0QNQ c0qnq = this.LIZ;
                if (c0qnq.LLIZ == null) {
                    c0qnq.LLIZ = c0qnq.findViewById(R.id.x5l);
                }
                View view = this.LIZ.LLIZ;
                if (view != null && view.getVisibility() == 0) {
                    float x = view.getX();
                    float y = view.getY();
                    int width = view.getWidth();
                    int height = view.getHeight();
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    if (x2 <= width + x && x2 >= x && y2 <= height + y && y2 >= y) {
                        return;
                    }
                }
                Iterator it2 = ((ArrayList) this.LIZ.LLIZLLLIL).iterator();
                while (it2.hasNext()) {
                    ((C0QNT) it2.next()).LIZ(motionEvent);
                }
            }
        }
        if (actionMasked == 2) {
            SearchIntermediateViewModelNew searchIntermediateViewModelNew3 = this.LIZ.LL;
            if (searchIntermediateViewModelNew3 != null) {
                searchIntermediateViewModelNew = searchIntermediateViewModelNew3;
            }
            Boolean bool = (Boolean) ((LiveData) searchIntermediateViewModelNew.LLILZIL.getValue()).getValue();
            if ((bool == null || bool.booleanValue()) && (interfaceC668720QKw = this.LIZIZ) != null && (c0qnuLIZLLL = interfaceC668720QKw.LIZLLL()) != null) {
                c0qnuLIZLLL.LIZ();
            }
        }
    }

    public C0QNR(C0QNQ c0qnq, C19EG c19eg, InterfaceC668720QKw interfaceC668720QKw) {
        this.LIZ = c0qnq;
        this.LIZIZ = interfaceC668720QKw;
    }
}

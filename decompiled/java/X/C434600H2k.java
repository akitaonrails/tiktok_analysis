package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.IReferenceListAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.horizontal.ReferenceHorizontalAwemeItemCell;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.horizontal.ReferenceHorizontalViewMoreItemCell;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.horizontal.ReferenceHorizontalWebLinkItemCell;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0H2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434600H2k extends LinearLayout implements IReferenceListAbility {
    public C434640H2o LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.IReferenceListAbility
    public final void WT(int i) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.IReferenceListAbility
    public C434640H2o getReferenceRenderData() {
        return null;
    }

    private final ViewOnAttachStateChangeListenerC20604515jv getRefList() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLILLL.getValue();
    }

    public final View getLayout() {
        return (View) this.LLILLJJLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.IReferenceListAbility
    public final void lE0(int i) {
        List<InterfaceC434580H2i> list;
        InterfaceC1891350zJl interfaceC1891350zJlLJI = getRefList().getState().LJI(i);
        Map<String, String> map = null;
        if (interfaceC1891350zJlLJI instanceof C434550H2f) {
            C434640H2o c434640H2o = this.LL;
            if (c434640H2o != null) {
                map = c434640H2o.LIZIZ;
            }
            C435840H7e.LIZ(map, false, "click_words_source_more", (InterfaceC434580H2i) interfaceC1891350zJlLJI, null, 16);
            C438260HGm c438260HGm = C438260HGm.LIZ;
            C434640H2o c434640H2o2 = this.LL;
            c438260HGm.getClass();
            C438260HGm.LIZ(this, c434640H2o2, false, null);
            return;
        }
        C434640H2o c434640H2o3 = this.LL;
        if (c434640H2o3 != null) {
            list = c434640H2o3.LIZ;
        } else {
            list = null;
        }
        InterfaceC434580H2i interfaceC434580H2i = (InterfaceC434580H2i) C444200HbO.LIZ(i, list);
        if (interfaceC434580H2i == null) {
            return;
        }
        C665180Q7g c665180Q7g = C665180Q7g.LIZ;
        Context context = getContext();
        C434640H2o c434640H2o4 = this.LL;
        c665180Q7g.getClass();
        C665180Q7g.LIZ(interfaceC434580H2i, context, c434640H2o4, null, null);
        C434640H2o c434640H2o5 = this.LL;
        if (c434640H2o5 != null) {
            map = c434640H2o5.LIZIZ;
        }
        C435840H7e.LIZ(map, false, "click_words_source_doc", interfaceC434580H2i, null, 16);
    }

    public C434600H2k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 78));
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1243));
    }

    public static void LIZIZ(C434600H2k c434600H2k, C434640H2o c434640H2o) {
        c434600H2k.LL = c434640H2o;
        List<InterfaceC434580H2i> listLJLIL = c434640H2o.LIZ;
        if (listLJLIL.size() > 4) {
            listLJLIL = C13LP.LJLIL(Collections.singletonList(new C434550H2f(c434640H2o, 3, listLJLIL.size())), C13LP.LL(listLJLIL, 3));
        }
        c434600H2k.getRefList().getState().LJIILL(listLJLIL, null);
    }

    public final void LIZ(LifecycleOwner lifecycleOwner, InterfaceC665370Q7z interfaceC665370Q7z) {
        ViewOnAttachStateChangeListenerC20604515jv refList = getRefList();
        refList.setLayoutManager(new LinearLayoutManager(refList.getContext(), 0, false));
        refList.LJIILJJIL(ReferenceHorizontalAwemeItemCell.class, ReferenceHorizontalWebLinkItemCell.class, ReferenceHorizontalViewMoreItemCell.class);
        refList.setItemAnimator(null);
        refList.addItemDecoration(new C0DXR() { // from class: X.06XB
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                float fLIZIZ;
                float fLIZIZ2;
                float fLIZIZ3;
                float fLIZIZ4;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int iLIZIZ = c21673919s1.LIZIZ();
                boolean zLIZLLL = C426750GoL.LIZLLL(recyclerView.getContext());
                Float fValueOf = Float.valueOf(16.0f);
                if (iLIZIZ == 1) {
                    rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
                    rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
                    return;
                }
                if (childAdapterPosition == 0) {
                    if (zLIZLLL) {
                        fLIZIZ3 = C418440Gaw.LIZIZ(Float.valueOf(6.0f));
                    } else {
                        fLIZIZ3 = C418440Gaw.LIZIZ(fValueOf);
                    }
                    rect.left = C814420VxA.LIZIZ(fLIZIZ3);
                    if (zLIZLLL) {
                        fLIZIZ4 = C418440Gaw.LIZIZ(fValueOf);
                    } else {
                        fLIZIZ4 = C418440Gaw.LIZIZ(Float.valueOf(6.0f));
                    }
                    rect.right = C814420VxA.LIZIZ(fLIZIZ4);
                    return;
                }
                if (childAdapterPosition == iLIZIZ - 1) {
                    if (zLIZLLL) {
                        fLIZIZ = C418440Gaw.LIZIZ(fValueOf);
                    } else {
                        fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(6.0f));
                    }
                    rect.left = C814420VxA.LIZIZ(fLIZIZ);
                    if (zLIZLLL) {
                        fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(6.0f));
                    } else {
                        fLIZIZ2 = C418440Gaw.LIZIZ(fValueOf);
                    }
                    rect.right = C814420VxA.LIZIZ(fLIZIZ2);
                    return;
                }
                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f)));
                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f)));
            }
        });
        refList.setTag(R.id.rnd, interfaceC665370Q7z);
        C1558520qew.LJII(interfaceC665370Q7z, this, IReferenceListAbility.class, null, lifecycleOwner);
    }
}

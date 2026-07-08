package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19ED, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19ED implements LayoutInflater.Factory2 {
    public final FragmentManager LL;

    public C19ED(FragmentManager fragmentManager) {
        this.LL = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C19EC c19ecLJIILL;
        int i;
        if (C20247014Ke.class.getName().equals(str)) {
            return new C20247014Ke(context, attributeSet, this.LL);
        }
        final Fragment fragmentLIZ = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Fragment);
        if (attributeValue == null) {
            attributeValue = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.Fragment_android_name);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.Fragment_android_id, -1);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.Fragment_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            int id = 0;
            try {
                zIsAssignableFrom = Fragment.class.isAssignableFrom(C20135813qW.LIZIZ(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                if (view != null) {
                    id = view.getId();
                }
                if (id == -1 && resourceId == -1 && strXd == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(attributeSet.getPositionDescription());
                    sbLIZ.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                    sbLIZ.append(attributeValue);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (resourceId != -1) {
                    fragmentLIZ = this.LL.LJJJJZ(resourceId);
                }
                if (fragmentLIZ == null && strXd != null) {
                    fragmentLIZ = this.LL.LJJJJZI(strXd);
                }
                if (fragmentLIZ == null && id != -1) {
                    fragmentLIZ = this.LL.LJJJJZ(id);
                }
                if (fragmentLIZ == null) {
                    C20135813qW c20135813qWLJJLIIIJJIZ = this.LL.LJJLIIIJJIZ();
                    context.getClassLoader();
                    fragmentLIZ = c20135813qWLJJLIIIJJIZ.LIZ(attributeValue);
                    fragmentLIZ.mFromLayout = true;
                    if (resourceId != 0) {
                        i = resourceId;
                    } else {
                        i = id;
                    }
                    fragmentLIZ.mFragmentId = i;
                    fragmentLIZ.mContainerId = id;
                    fragmentLIZ.mTag = strXd;
                    fragmentLIZ.mInLayout = true;
                    FragmentManager fragmentManager = this.LL;
                    fragmentLIZ.mFragmentManager = fragmentManager;
                    fragmentLIZ.mHost = fragmentManager.LJJLIIIJLJLI();
                    fragmentLIZ.onInflate(this.LL.LJJLIIIJLJLI().LLILLJJLI, attributeSet, fragmentLIZ.mSavedFragmentState);
                    c19ecLJIILL = this.LL.LIZLLL(fragmentLIZ);
                } else if (!fragmentLIZ.mInLayout) {
                    fragmentLIZ.mInLayout = true;
                    FragmentManager fragmentManager2 = this.LL;
                    fragmentLIZ.mFragmentManager = fragmentManager2;
                    fragmentLIZ.mHost = fragmentManager2.LJJLIIIJLJLI();
                    fragmentLIZ.onInflate(this.LL.LJJLIIIJLJLI().LLILLJJLI, attributeSet, fragmentLIZ.mSavedFragmentState);
                    c19ecLJIILL = this.LL.LJIILL(fragmentLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(attributeSet.getPositionDescription());
                    sbLIZ2.append(": Duplicate id 0x");
                    sbLIZ2.append(Integer.toHexString(resourceId));
                    sbLIZ2.append(", tag ");
                    sbLIZ2.append(strXd);
                    sbLIZ2.append(", or parent id 0x");
                    sbLIZ2.append(Integer.toHexString(id));
                    sbLIZ2.append(" with another fragment for ");
                    sbLIZ2.append(attributeValue);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                final ViewGroup viewGroup = (ViewGroup) view;
                C1278104zL c1278104zL = C19EM.LIZ;
                AbstractC1889400zGc abstractC1889400zGc = new AbstractC1889400zGc(fragmentLIZ, viewGroup) { // from class: X.0yiR
                    public final ViewGroup LLILLJJLI;

                    public final ViewGroup getParentContainer() {
                        return this.LLILLJJLI;
                    }

                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Attempting to use <fragment> tag to add fragment ");
                        sbLIZ3.append(fragmentLIZ);
                        sbLIZ3.append(" to container ");
                        sbLIZ3.append(viewGroup);
                        super(fragmentLIZ, C2188811AlT.LIZIZ(sbLIZ3));
                        this.LLILLJJLI = viewGroup;
                    }
                };
                C1278104zL c1278104zLLIZ = C19EM.LIZ(fragmentLIZ);
                if (c1278104zLLIZ.LIZ.contains(C19EX.DETECT_FRAGMENT_TAG_USAGE) && C19EM.LIZLLL(c1278104zLLIZ, fragmentLIZ.getClass(), C1868210yiR.class)) {
                    C19EM.LIZIZ(c1278104zLLIZ, abstractC1889400zGc);
                }
                fragmentLIZ.mContainer = viewGroup;
                try {
                    c19ecLJIILL.LJIIIZ();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1AF0.LJ(new RuntimeException("FragmentStateManager moveToExpectedState exception ---> "));
                }
                c19ecLJIILL.LJIIIIZZ();
                View view2 = fragmentLIZ.mView;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragmentLIZ.mView.getTag() == null) {
                        fragmentLIZ.mView.setTag(strXd);
                    }
                    fragmentLIZ.mView.addOnAttachStateChangeListener(new C19LT(c19ecLJIILL, this, 0));
                    return fragmentLIZ.mView;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Fragment ");
                sbLIZ3.append(attributeValue);
                sbLIZ3.append(" did not create a view.");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return null;
    }
}

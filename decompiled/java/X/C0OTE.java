package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleBadgeModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OTE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OTE implements C0OT0 {
    public final InterfaceC497601wk LIZ;
    public final View LIZIZ;
    public final C01GW LIZJ;
    public C2481009ns LIZLLL;
    public C2481009ns LJ;
    public C2481009ns LJFF;
    public C2481009ns LJI;
    public C0OTF LJII;
    public final List<C2481009ns> LJIIIIZZ;
    public int LJIIIZ;

    @Override // X.C0OT0
    public final View LJIJI() {
        throw null;
    }

    public final void LJFF(BulletinBaseItem bulletinBaseItem) {
        BulletinStyleBadgeModel bulletinStyleBadgeModel;
        BulletinGeckoResourceModel bulletinGeckoResourceModel;
        BulletinGeckoResourceModel bulletinGeckoResourceModel2;
        BulletinGeckoResourceModel bulletinGeckoResourceModel3;
        BulletinGeckoResourceModel bulletinGeckoResourceModel4;
        BulletinGeckoResourceModel bulletinGeckoResourceModel5;
        BulletinGeckoResourceModel bulletinGeckoResourceModel6;
        BulletinGeckoResourceModel bulletinGeckoResourceModel7;
        BulletinGeckoResourceModel bulletinGeckoResourceModel8;
        boolean z;
        BulletinGeckoResourceModel bulletinGeckoResourceModel9;
        BulletinGeckoResourceModel bulletinGeckoResourceModel10;
        BulletinGeckoResourceModel bulletinGeckoResourceModel11;
        BulletinGeckoResourceModel bulletinGeckoResourceModel12;
        if (C0OS8.LJI()) {
            View view = (View) this.LIZJ.getValue();
            if (view != null) {
                C12ES.LJIILL(0, view);
            }
        } else {
            View viewFindViewById = this.LIZIZ.findViewById(R.id.d1c);
            if (viewFindViewById != null) {
                C12ES.LJIILL(0, viewFindViewById);
            }
        }
        BulletinStyleStruct bulletinStyleStructLJ = bulletinBaseItem.LJ();
        if (bulletinStyleStructLJ != null) {
            bulletinStyleBadgeModel = bulletinStyleStructLJ.badgeModel;
        } else {
            bulletinStyleBadgeModel = null;
        }
        boolean z2 = bulletinBaseItem.LLILZ;
        this.LJII = C0OTF.LL;
        ((ArrayList) this.LJIIIIZZ).clear();
        this.LJIIIZ = 0;
        C0OTG[] c0otgArr = new C0OTG[4];
        if (bulletinStyleBadgeModel != null) {
            bulletinGeckoResourceModel = bulletinStyleBadgeModel.topLeftSources;
        } else {
            bulletinGeckoResourceModel = null;
        }
        c0otgArr[0] = new C0OTG(bulletinGeckoResourceModel);
        if (bulletinStyleBadgeModel != null) {
            bulletinGeckoResourceModel2 = bulletinStyleBadgeModel.topRightSources;
        } else {
            bulletinGeckoResourceModel2 = null;
        }
        c0otgArr[1] = new C0OTG(bulletinGeckoResourceModel2);
        if (bulletinStyleBadgeModel != null) {
            bulletinGeckoResourceModel3 = bulletinStyleBadgeModel.bottomLeftSources;
        } else {
            bulletinGeckoResourceModel3 = null;
        }
        c0otgArr[2] = new C0OTG(bulletinGeckoResourceModel3);
        if (bulletinStyleBadgeModel != null) {
            bulletinGeckoResourceModel4 = bulletinStyleBadgeModel.bottomRightSources;
        } else {
            bulletinGeckoResourceModel4 = null;
        }
        c0otgArr[3] = new C0OTG(bulletinGeckoResourceModel4);
        List listLJIIJJI = C1697810uHb.LJIIJJI(c0otgArr);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJIIJJI.iterator();
        while (it2.hasNext()) {
            BulletinGeckoResourceModel bulletinGeckoResourceModel13 = ((C0OTG) it2.next()).LIZ;
            if (bulletinGeckoResourceModel13 != null) {
                arrayList.add(bulletinGeckoResourceModel13);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            BulletinGeckoResourceModel bulletinGeckoResourceModel14 = (BulletinGeckoResourceModel) obj;
            if (z2 && C617100OIi.LIZJ(bulletinGeckoResourceModel14)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            this.LJII = C0OTF.LLILZIL;
            if (bulletinStyleBadgeModel != null) {
                bulletinGeckoResourceModel9 = bulletinStyleBadgeModel.topLeftSources;
            } else {
                bulletinGeckoResourceModel9 = null;
            }
            this.LIZLLL = LIZLLL("topLeft", bulletinGeckoResourceModel9, this.LIZLLL, R.id.yb4, z2, false);
            if (bulletinStyleBadgeModel != null) {
                bulletinGeckoResourceModel10 = bulletinStyleBadgeModel.topRightSources;
            } else {
                bulletinGeckoResourceModel10 = null;
            }
            this.LJ = LIZLLL("topRight", bulletinGeckoResourceModel10, this.LJ, R.id.ycl, z2, false);
            if (bulletinStyleBadgeModel != null) {
                bulletinGeckoResourceModel11 = bulletinStyleBadgeModel.bottomLeftSources;
            } else {
                bulletinGeckoResourceModel11 = null;
            }
            this.LJFF = LIZLLL("bottomLeft", bulletinGeckoResourceModel11, this.LJFF, R.id.cee, z2, false);
            if (bulletinStyleBadgeModel != null) {
                bulletinGeckoResourceModel12 = bulletinStyleBadgeModel.bottomRightSources;
            } else {
                bulletinGeckoResourceModel12 = null;
            }
            this.LJI = LIZLLL("bottomRight", bulletinGeckoResourceModel12, this.LJI, R.id.cgb, z2, false);
            z = false;
        } else {
            this.LJII = C0OTF.LLILLJJLI;
            if (bulletinStyleBadgeModel != null) {
                bulletinGeckoResourceModel5 = bulletinStyleBadgeModel.topLeftSources;
            } else {
                bulletinGeckoResourceModel5 = null;
            }
            this.LIZLLL = LIZLLL("topLeft", bulletinGeckoResourceModel5, this.LIZLLL, R.id.yb4, z2, C13LP.LJJJJ(((C0OTG) ListProtector.get(listLJIIJJI, 0)).LIZ, arrayList2));
            if (bulletinStyleBadgeModel != null) {
                bulletinGeckoResourceModel6 = bulletinStyleBadgeModel.topRightSources;
            } else {
                bulletinGeckoResourceModel6 = null;
            }
            this.LJ = LIZLLL("topRight", bulletinGeckoResourceModel6, this.LJ, R.id.ycl, z2, C13LP.LJJJJ(((C0OTG) ListProtector.get(listLJIIJJI, 1)).LIZ, arrayList2));
            if (bulletinStyleBadgeModel != null) {
                bulletinGeckoResourceModel7 = bulletinStyleBadgeModel.bottomLeftSources;
            } else {
                bulletinGeckoResourceModel7 = null;
            }
            this.LJFF = LIZLLL("bottomLeft", bulletinGeckoResourceModel7, this.LJFF, R.id.cee, z2, C13LP.LJJJJ(((C0OTG) ListProtector.get(listLJIIJJI, 2)).LIZ, arrayList2));
            if (bulletinStyleBadgeModel != null) {
                bulletinGeckoResourceModel8 = bulletinStyleBadgeModel.bottomRightSources;
            } else {
                bulletinGeckoResourceModel8 = null;
            }
            this.LJI = LIZLLL("bottomRight", bulletinGeckoResourceModel8, this.LJI, R.id.cgb, z2, C13LP.LJJJJ(((C0OTG) ListProtector.get(listLJIIJJI, 3)).LIZ, arrayList2));
            z = false;
        }
        bulletinBaseItem.LLILZ = z;
    }

    public C0OTE(ViewStub viewStub, InterfaceC497601wk interfaceC497601wk) {
        View viewLJLLLL;
        ViewGroup viewGroup;
        this.LIZ = interfaceC497601wk;
        if (C0OS8.LJI()) {
            ViewParent parent = viewStub.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                C786410Ut5.LJJLJLI(viewStub, viewGroup);
                Context context = viewStub.getContext();
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                ConstraintLayout constraintLayout = new ConstraintLayout(context);
                constraintLayout.setId(R.id.d1c);
                C786410Ut5.m6(constraintLayout, layoutParams);
                ViewStub viewStub2 = new ViewStub(context);
                viewStub2.setId(R.id.yb4);
                C19ME c19me = new C19ME(iLIZIZ, iLIZIZ);
                c19me.startToStart = 0;
                c19me.topToTop = 0;
                C786410Ut5.Y5(viewStub2, c19me);
                constraintLayout.addView(viewStub2);
                ViewStub viewStub3 = new ViewStub(context);
                viewStub3.setId(R.id.ycl);
                C19ME c19me2 = new C19ME(iLIZIZ, iLIZIZ);
                c19me2.endToEnd = 0;
                c19me2.topToTop = 0;
                C786410Ut5.Y5(viewStub3, c19me2);
                constraintLayout.addView(viewStub3);
                ViewStub viewStub4 = new ViewStub(context);
                viewStub4.setId(R.id.cee);
                C19ME c19me3 = new C19ME(iLIZIZ, iLIZIZ);
                c19me3.startToStart = 0;
                c19me3.bottomToBottom = 0;
                C786410Ut5.Y5(viewStub4, c19me3);
                constraintLayout.addView(viewStub4);
                ViewStub viewStub5 = new ViewStub(context);
                viewStub5.setId(R.id.cgb);
                C19ME c19me4 = new C19ME(iLIZIZ, iLIZIZ);
                c19me4.endToEnd = 0;
                c19me4.bottomToBottom = 0;
                C786410Ut5.Y5(viewStub5, c19me4);
                constraintLayout.addView(viewStub5);
                viewGroup.addView(constraintLayout, iIndexOfChild);
                viewLJLLLL = constraintLayout;
            } else {
                viewStub.setLayoutResource(R.layout.f869a75);
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            }
        } else {
            viewStub.setLayoutResource(R.layout.f869a75);
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        }
        this.LIZIZ = viewLJLLLL;
        this.LIZJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1722));
        this.LJII = C0OTF.LL;
        this.LJIIIIZZ = new ArrayList();
    }

    public final C2481009ns LIZLLL(String str, BulletinGeckoResourceModel bulletinGeckoResourceModel, C2481009ns c2481009ns, int i, boolean z, boolean z2) {
        boolean z3;
        C2481009ns c2481009ns2;
        boolean z4 = true;
        if (bulletinGeckoResourceModel != null && C617100OIi.LJ(bulletinGeckoResourceModel)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (c2481009ns == null) {
                c2481009ns2 = new C2481009ns((ViewStub) this.LIZIZ.findViewById(i), this.LIZ, str);
            } else {
                c2481009ns2 = c2481009ns;
            }
            if (!C0OS8.LJI()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BulletinBadgeWidget [");
                sbLIZ.append(str);
                sbLIZ.append("] bindOrResetCorner: reUse widget:");
                if (c2481009ns == null) {
                    z4 = false;
                }
                sbLIZ.append(z4);
                sbLIZ.append(", needSync:");
                sbLIZ.append(z2);
                C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (z2) {
                ((ArrayList) this.LJIIIIZZ).add(c2481009ns2);
                c2481009ns2.LIZLLL(bulletinGeckoResourceModel, z, new AwS553S0100000_9(this, 1723), new AwS553S0100000_9(this, 1724));
                return c2481009ns2;
            }
            c2481009ns2.LIZLLL(bulletinGeckoResourceModel, z, null, null);
            return c2481009ns2;
        }
        if (!C0OS8.LJI()) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BulletinBadgeWidget [");
            sbLIZ2.append(str);
            sbLIZ2.append("] bindOrResetCorner: resourceModel is empty");
            C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (c2481009ns != null) {
            c2481009ns.LJFF();
            return c2481009ns;
        }
        return c2481009ns;
    }
}

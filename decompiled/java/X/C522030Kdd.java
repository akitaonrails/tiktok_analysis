package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.component.phone.change.consult.ConsultPhoneChangeDialogFragment;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseBottomAssem;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseBottomAssemV2;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem.SpacePostCategoryAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0Kdd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C522030Kdd extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C522030Kdd(ConsultPhoneChangeDialogFragment consultPhoneChangeDialogFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = consultPhoneChangeDialogFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C522030Kdd(PcsCourseBottomAssem pcsCourseBottomAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = pcsCourseBottomAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C522030Kdd(PcsCourseBottomAssemV2 pcsCourseBottomAssemV2, int i) {
        super(4);
        this.$t = i;
        this.l0 = pcsCourseBottomAssemV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C522030Kdd(SpacePostCategoryAssem spacePostCategoryAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = spacePostCategoryAssem;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(C522030Kdd c522030Kdd, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        EnumC488160JCk enumC488160JCk = (EnumC488160JCk) obj2;
        String string = (String) obj3;
        if (enumC488160JCk != null && (i = C488310JCz.LIZ[enumC488160JCk.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (obj4 != null) {
                            ((ConsultPhoneChangeDialogFragment) c522030Kdd.l0).LLILZIL.invoke(obj4);
                        }
                        C1390410mHn c1390410mHn = ((ConsultPhoneChangeDialogFragment) c522030Kdd.l0).LLIZ;
                        if (c1390410mHn != null) {
                            C786410Ut5.LLLZZIL(c1390410mHn, 4);
                        }
                        ((ConsultPhoneChangeDialogFragment) c522030Kdd.l0).dismiss();
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C1390410mHn c1390410mHn2 = ((ConsultPhoneChangeDialogFragment) c522030Kdd.l0).LLIZ;
                    if (c1390410mHn2 != null) {
                        C786410Ut5.LLLZZIL(c1390410mHn2, 4);
                    }
                    C1397580mTM c1397580mTM = new C1397580mTM(((ConsultPhoneChangeDialogFragment) c522030Kdd.l0).LL);
                    if (string == null || string.length() == 0) {
                        string = ((ConsultPhoneChangeDialogFragment) c522030Kdd.l0).LL.getString(2131848597);
                    }
                    c1397580mTM.LIZIZ(string);
                    C985403tE.LIZ(c1397580mTM, new AwS586S0100000_7((ConsultPhoneChangeDialogFragment) c522030Kdd.l0, 197));
                    c1397580mTM.LJII = false;
                    new C1397510mTF(c1397580mTM).LIZLLL();
                }
            } else {
                C1390410mHn c1390410mHn3 = ((ConsultPhoneChangeDialogFragment) c522030Kdd.l0).LLIZ;
                if (c1390410mHn3 != null) {
                    C786410Ut5.LLLZZIL(c1390410mHn3, 0);
                }
                C1390410mHn c1390410mHn4 = ((ConsultPhoneChangeDialogFragment) c522030Kdd.l0).LLIZ;
                if (c1390410mHn4 != null) {
                    c1390410mHn4.LIZJ();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C522030Kdd c522030Kdd, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        List list = (List) ((C291001Au) obj2).LIZ;
        C197039127h c197039127h = ((PcsCourseBottomAssem) c522030Kdd.l0).LLJJIJI;
        if (c197039127h != null) {
            if (!list.isEmpty() && !zBooleanValue && zBooleanValue2) {
                z = true;
            } else {
                z = false;
            }
            c197039127h.setEnabled(z);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C522030Kdd c522030Kdd, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        List list = (List) ((C291001Au) obj2).LIZ;
        C197039127h c197039127h = ((PcsCourseBottomAssemV2) c522030Kdd.l0).LLJJIJI;
        if (c197039127h != null) {
            if (!list.isEmpty() && !zBooleanValue && zBooleanValue2) {
                z = true;
            } else {
                z = false;
            }
            c197039127h.setEnabled(z);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C522030Kdd c522030Kdd, Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        C511110K2r c511110K2r;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            obj5 = c291001Au.LIZ;
        } else {
            obj5 = null;
        }
        if (obj5 != null || ((c511110K2r = ((SpacePostCategoryAssem) c522030Kdd.l0).Ho().LLILZIL) != null && c511110K2r.LIZJ())) {
            TextView textView = ((SpacePostCategoryAssem) c522030Kdd.l0).LLIZLLLIL;
            if (textView != null) {
                textView.setText(C511520K4g.LJII(2131839587));
            }
        } else {
            TextView textView2 = ((SpacePostCategoryAssem) c522030Kdd.l0).LLIZLLLIL;
            if (textView2 != null) {
                textView2.setText(C511520K4g.LJII(2131839587));
            }
        }
        return Unit.LIZ;
    }
}

package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.animation.BulletinInputAnimationManagerAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinTooltipAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.topic.ui.TopicDescRatingAssem;
import com.ss.android.ugc.profile.business.profile.menu.ProfilePageMenuFragment;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0P4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C639090P4x extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
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
    public C639090P4x(BulletinInputAnimationManagerAssem bulletinInputAnimationManagerAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = bulletinInputAnimationManagerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C639090P4x(BulletinTooltipAssem bulletinTooltipAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = bulletinTooltipAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C639090P4x(TopicDescRatingAssem topicDescRatingAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = topicDescRatingAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C639090P4x(ProfilePageMenuFragment profilePageMenuFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = profilePageMenuFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(X.C639090P4x r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C639090P4x.invoke$0(X.0P4x, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(C639090P4x c639090P4x, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        ((Number) obj4).intValue();
        ((ProfilePageMenuFragment) c639090P4x.l0).MR().setState(AFwS240S0000000_9.get$arr$(818));
        return Unit.LIZ;
    }

    public static final Object invoke$2(C639090P4x c639090P4x, Object obj, Object obj2, Object obj3, Object obj4) {
        AssemVMLazy assemVMLazy = ((BulletinTooltipAssem) c639090P4x.l0).LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BulletinTooltipAssem.LLIZLLLIL;
        if (((BulletinInputStateViewModel) assemVMLazy.getValue()).vQ2()) {
            ((BulletinTooltipAssem) c639090P4x.l0).bo();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C639090P4x c639090P4x, Object obj, Object obj2, Object obj3, Object obj4) {
        float fFloatValue = ((Number) obj2).floatValue();
        long jLongValue = ((Number) obj3).longValue();
        ((Number) obj4).longValue();
        C418540Gb6 c418540Gb6 = ((TopicDescRatingAssem) c639090P4x.l0).LLJJIII;
        TuxTextView tuxTextView = null;
        if (c418540Gb6 == null) {
            c418540Gb6 = null;
        }
        c418540Gb6.setRatingValue(fFloatValue);
        TuxTextView tuxTextView2 = ((TopicDescRatingAssem) c639090P4x.l0).LLJJIJI;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView2.setText(String.valueOf(C814420VxA.LIZIZ(fFloatValue * 10) / 10.0f));
        TuxTextView tuxTextView3 = ((TopicDescRatingAssem) c639090P4x.l0).LLJJIJIIJIL;
        if (tuxTextView3 != null) {
            tuxTextView = tuxTextView3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append(jLongValue);
        sbLIZ.append(')');
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        TopicDescRatingAssem topicDescRatingAssem = (TopicDescRatingAssem) c639090P4x.l0;
        if (topicDescRatingAssem.LLJJIJIL) {
            AssemVMLazy assemVMLazy = topicDescRatingAssem.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TopicDescRatingAssem.LLJJJ;
            assemVMLazy.getValue().setState(AFwS240S0000000_9.get$arr$(23));
            ((TopicDescRatingAssem) c639090P4x.l0).LLJJIJIL = false;
        }
        return Unit.LIZ;
    }
}

package Y;

import X.C0LAB;
import X.C0TI1;
import X.C0WZX;
import X.C15N1;
import X.C1954807lC;
import X.C20097413kK;
import X.C20580115fz;
import X.C20581315gB;
import X.C20581415gC;
import X.C20581815gG;
import X.C20581915gH;
import X.C20583215gU;
import X.C20584715gj;
import X.C20684815ws;
import X.C2204961BRm;
import X.C317160Cby;
import X.C339990DUn;
import X.C786410Ut5;
import X.EnumC1405120mfW;
import X.EnumC20581215gA;
import X.EnumC20615215le;
import X.EnumC339980DUm;
import android.text.Editable;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import com.ss.android.ugc.aweme.feed.model.story.RichTextInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM;
import com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment;
import com.ss.android.ugc.aweme.story.userpanel.ui.dm.DmListCell;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class AObserverS190S0200000_31 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) throws Throwable {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS190S0200000_31 aObserverS190S0200000_31, Object obj) {
        EnumC20615215le enumC20615215le = (EnumC20615215le) ((Map) obj).get(((C317160Cby) aObserverS190S0200000_31.l0).LL.getUid());
        if (enumC20615215le == null) {
            enumC20615215le = EnumC20615215le.NOT_SENT;
        }
        ((DmListCell) aObserverS190S0200000_31.l1).N5(enumC20615215le);
    }

    public static final void onChanged$1(AObserverS190S0200000_31 aObserverS190S0200000_31, Object obj) throws Throwable {
        int length;
        if (((Boolean) obj).booleanValue()) {
            C20584715gj c20584715gj = (C20584715gj) aObserverS190S0200000_31.l0;
            Editable editableS = C2204961BRm.s(c20584715gj, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8bI3XkjynXmSYc+Nz333g7LZNR6OMRMeyqPFtn0SbguNn/XMU2Ev9prP5Vw==", null));
            if (editableS != null) {
                length = editableS.length();
            } else {
                length = 0;
            }
            c20584715gj.setSelection(length);
            StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVMWR = ((StoryThoughtAvatarCreationFragment) aObserverS190S0200000_31.l1).WR();
            if (storyThoughtAvatarCreationVMWR.LLJLLL.getValue() == EnumC20581215gA.FRIENDS) {
                storyThoughtAvatarCreationVMWR.LL.getClass();
                if (C0TI1.LIZ()) {
                    storyThoughtAvatarCreationVMWR.LLILLJJLI.setValue(Unit.LIZ);
                }
            }
        }
    }

    public static final void onChanged$10(AObserverS190S0200000_31 aObserverS190S0200000_31, Object obj) {
        ((CommerceToolsTcmServiceImpl) aObserverS190S0200000_31.l0).LJIILJJIL((CommerceToolsTcmModel) aObserverS190S0200000_31.l1, (C15N1) obj);
    }

    public static final void onChanged$2(AObserverS190S0200000_31 aObserverS190S0200000_31, Object obj) throws Throwable {
        Pair pair = (Pair) obj;
        String str = (String) pair.getFirst();
        List<RichTextInfo> list = (List) pair.getSecond();
        int selectionStart = ((C20584715gj) aObserverS190S0200000_31.l0).getSelectionStart();
        int selectionEnd = ((C20584715gj) aObserverS190S0200000_31.l0).getSelectionEnd();
        ((C20580115fz) aObserverS190S0200000_31.l1).LLJJJIL.LJIIL(str, list);
        ((C20584715gj) aObserverS190S0200000_31.l0).setSelection(selectionStart, selectionEnd);
    }

    public static final void onChanged$3(AObserverS190S0200000_31 aObserverS190S0200000_31, Object obj) {
        ((C20580115fz) aObserverS190S0200000_31.l0).LLJJJJJIL.setEnabled(((Boolean) obj).booleanValue());
        if (((StoryThoughtAvatarCreationFragment) aObserverS190S0200000_31.l1).WR().LLLJL.getValue() != EnumC1405120mfW.DEFAULT) {
            ((C20580115fz) aObserverS190S0200000_31.l0).LLJJJJJIL.setTextColorRes(R.attr.z_);
        }
    }

    public static final void onChanged$4(AObserverS190S0200000_31 aObserverS190S0200000_31, Object obj) {
        ((C20581915gH) aObserverS190S0200000_31.l0).LLJJIJI.setEnabled(((Boolean) obj).booleanValue());
        ((C20581915gH) aObserverS190S0200000_31.l0).LLJJIJI.setTextColor(((StoryThoughtCreationFragment) aObserverS190S0200000_31.l1).SR().LLJILJIL);
    }

    public static final void onChanged$5(AObserverS190S0200000_31 aObserverS190S0200000_31, Object obj) {
        int i;
        EnumC20581215gA enumC20581215gA = (EnumC20581215gA) obj;
        ((StoryThoughtAvatarCreationFragment) aObserverS190S0200000_31.l0).dS(enumC20581215gA);
        int i2 = C20581315gB.LIZ[enumC20581215gA.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                i = 2131849041;
            } else {
                i = 2131849043;
            }
        } else {
            i = 2131849042;
        }
        ((C20580115fz) aObserverS190S0200000_31.l1).LLJJI.setText(i);
    }

    public static final void onChanged$6(AObserverS190S0200000_31 aObserverS190S0200000_31, Object obj) {
        ((C20581915gH) aObserverS190S0200000_31.l0).LLJILJILJ.LIZIZ((User) aObserverS190S0200000_31.l1, (BackgroundModel) obj, null);
    }

    public static final void onChanged$7(AObserverS190S0200000_31 aObserverS190S0200000_31, Object obj) {
        int i;
        EnumC20581215gA enumC20581215gA = (EnumC20581215gA) obj;
        ((StoryThoughtCreationFragment) aObserverS190S0200000_31.l0).WR(enumC20581215gA);
        int i2 = C20581415gC.LIZ[enumC20581215gA.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                i = 2131849041;
            } else {
                i = 2131849043;
            }
        } else {
            i = 2131849042;
        }
        ((C20581915gH) aObserverS190S0200000_31.l1).LLJ.setText(i);
    }

    public static final void onChanged$8(AObserverS190S0200000_31 aObserverS190S0200000_31, Object obj) {
        EnumC339980DUm enumC339980DUm = (EnumC339980DUm) obj;
        if (enumC339980DUm != null) {
            switch (C339990DUn.LIZ[enumC339980DUm.ordinal()]) {
                case 1:
                    return;
                case 2:
                case 3:
                    C20097413kK.LIZ(((C20580115fz) aObserverS190S0200000_31.l0).LLJJJIL);
                    return;
                case 4:
                case 5:
                    ((StoryThoughtAvatarCreationFragment) aObserverS190S0200000_31.l1).cS(2131850185);
                    ((StoryThoughtAvatarCreationFragment) aObserverS190S0200000_31.l1).WR().NQ2();
                    ((StoryThoughtAvatarCreationFragment) aObserverS190S0200000_31.l1).WR().KQ2();
                    return;
                case 6:
                    ((StoryThoughtAvatarCreationFragment) aObserverS190S0200000_31.l1).cS(2131850186);
                    ((StoryThoughtAvatarCreationFragment) aObserverS190S0200000_31.l1).WR().NQ2();
                    ((StoryThoughtAvatarCreationFragment) aObserverS190S0200000_31.l1).WR().KQ2();
                    return;
                case 7:
                    StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVMWR = ((StoryThoughtAvatarCreationFragment) aObserverS190S0200000_31.l1).WR();
                    storyThoughtAvatarCreationVMWR.getClass();
                    C20581815gG c20581815gG = C20581815gG.LIZ;
                    C20583215gU c20583215gUAQ2 = storyThoughtAvatarCreationVMWR.AQ2();
                    boolean zGQ2 = storyThoughtAvatarCreationVMWR.GQ2();
                    c20581815gG.getClass();
                    C0LAB c0labLIZ = C20581815gG.LIZ(c20583215gUAQ2);
                    c0labLIZ.LIZ(zGQ2 ? 1 : 0, "is_draft");
                    C20684815ws.LJIILLIIL("generated_avatar_thought_show", c0labLIZ.LIZ);
                    return;
            }
        }
        throw new C1954807lC();
    }

    public static final void onChanged$9(AObserverS190S0200000_31 aObserverS190S0200000_31, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.FALSE)) {
            C786410Ut5.LJLLLLLL(0, ((C20580115fz) aObserverS190S0200000_31.l0).LLILLJJLI);
            C786410Ut5.Q8(((C20580115fz) aObserverS190S0200000_31.l0).LLILLJJLI, new ACListenerS165S0100000_31((StoryThoughtAvatarCreationFragment) aObserverS190S0200000_31.l1, 242));
        } else {
            C786410Ut5.LJLLLLLL(8, ((C20580115fz) aObserverS190S0200000_31.l0).LLILLJJLI);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS190S0200000_31(com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment r2, X.C20580115fz r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 3: goto Le;
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto L5;
                case 7: goto L5;
                case 8: goto Le;
                case 9: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS190S0200000_31.<init>(com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment, X.15fz, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS190S0200000_31(com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment r2, X.C20581915gH r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 4 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS190S0200000_31.<init>(com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment, X.15gH, int):void");
    }

    public AObserverS190S0200000_31(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

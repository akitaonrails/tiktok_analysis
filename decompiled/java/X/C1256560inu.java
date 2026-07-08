package X;

import Y.ARunnableS4S1400000_11;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtInfo;
import com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtType;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS420S0200000_19;

/* JADX INFO: renamed from: X.0inu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256560inu {
    public static final C1256560inu LIZ = new C1256560inu();

    public static boolean LIZLLL(Aweme aweme) {
        StoryNoteInfo storyNoteInfo;
        AvatarThoughtInfo avatarThoughtInfo;
        if (aweme != null && (storyNoteInfo = aweme.storyNoteInfo) != null && (avatarThoughtInfo = storyNoteInfo.avatarInfo) != null) {
            Integer num = avatarThoughtInfo.avatarType;
            int value = AvatarThoughtType.AVATARTYPE_AVATAR_THOUGHT.getValue();
            if (num != null && num.intValue() == value) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJ(Aweme aweme) {
        StoryNoteInfo storyNoteInfo;
        Integer numValueOf;
        if (aweme != null && (storyNoteInfo = aweme.storyNoteInfo) != null && (numValueOf = Integer.valueOf(storyNoteInfo.subType)) != null && numValueOf.intValue() != 0) {
            return true;
        }
        return false;
    }

    public static AwS420S0200000_19 LIZJ(EnumC1256590inx enumC1256590inx, Function0 function0) {
        if (!C298580Bn6.LIZ()) {
            return null;
        }
        return new AwS420S0200000_19(enumC1256590inx, function0, 214);
    }

    public static void LIZIZ(AvatarComponentView avatarComponentView, User user, LifecycleOwner lifecycleOwner, Function0 function0) {
        Object c098200Yq;
        if (user == null) {
            return;
        }
        try {
            c098200Yq = user.getUid();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (str == null) {
            str = "";
        }
        if (C727450SgB.LIZ(user)) {
            C427660Gpo.LJIIJJI(avatarComponentView.getAvatar(), Integer.valueOf(R.raw.icon_bitmap_story_reveal), false, null, null, false, false, null, null, false, null, 1022);
        }
        HandlerHook.viewPost(avatarComponentView, new ARunnableS4S1400000_11(avatarComponentView, function0, str, user, lifecycleOwner, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection r8, X.EnumC1256590inx r9, boolean r10, boolean r11) {
        /*
            boolean r0 = X.C298580Bn6.LIZ()
            r7 = 0
            if (r0 != 0) goto L8
            return r7
        L8:
            boolean r0 = X.C298590Bn7.LIZ()
            if (r0 != 0) goto Lf
            return r7
        Lf:
            r5 = 1
            if (r11 == 0) goto L15
            if (r10 == 0) goto L15
            return r5
        L15:
            if (r8 == 0) goto L5b
            java.lang.Integer r2 = r8.avatarThoughtType
            com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtType r0 = com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtType.AVATARTYPE_AVATAR_THOUGHT
            int r1 = r0.getValue()
            if (r2 == 0) goto L5b
            int r0 = r2.intValue()
            if (r0 != r1) goto L5b
            r6 = 1
        L28:
            if (r10 == 0) goto L59
            if (r8 == 0) goto L36
            java.lang.String r0 = r8.text
            if (r0 == 0) goto L36
            int r0 = r0.length()
            if (r0 != 0) goto L59
        L36:
            long r3 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.story.experiment.thought.AvatarThoughtsConfigs$Configs r0 = com.ss.android.ugc.aweme.story.experiment.thought.AvatarThoughtsConfigs.LIZ()
            long r1 = r0.newUserGuideExpireDate
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L59
            r2 = 1
        L45:
            int[] r1 = X.C1256580inw.LIZ
            int r0 = r9.ordinal()
            r1 = r1[r0]
            if (r1 == r5) goto L64
            r0 = 2
            if (r1 == r0) goto L63
            r0 = 3
            if (r1 == r0) goto L63
            r0 = 4
            if (r1 != r0) goto L5d
            return r6
        L59:
            r2 = 0
            goto L45
        L5b:
            r6 = 0
            goto L28
        L5d:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L63:
            return r2
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1256560inu.LJFF(com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection, X.0inx, boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C1256560inu r19, com.ss.android.ugc.aweme.avatar.AvatarComponentView r20, final X.InterfaceC1256280inS r21, androidx.lifecycle.LifecycleOwner r22, boolean r23, com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo r24, com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection r25, boolean r26, com.ss.android.ugc.aweme.profile.model.User r27, X.EnumC1256590inx r28, java.lang.Boolean r29, kotlin.jvm.functions.Function0 r30, X.InterfaceC1631620sYq r31, int r32) {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1256560inu.LIZ(X.0inu, com.ss.android.ugc.aweme.avatar.AvatarComponentView, X.0inS, androidx.lifecycle.LifecycleOwner, boolean, com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo, com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection, boolean, com.ss.android.ugc.aweme.profile.model.User, X.0inx, java.lang.Boolean, kotlin.jvm.functions.Function0, X.0sYq, int):void");
    }
}

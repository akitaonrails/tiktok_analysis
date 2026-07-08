package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedVHProxyAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RT8, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RT8 implements InterfaceC469360Ias {
    public int LL = -1;
    public boolean LLILLJJLI;
    public final /* synthetic */ StoryImmersiveUserFeedComponent LLILLL;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C0RT8(StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent) {
        this.LLILLL = storyImmersiveUserFeedComponent;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        C128Y c128yLIZLLL;
        Activity activityLIZ;
        UserFeedVHProxyAbility userFeedVHProxyAbilityMp;
        C0RGJ c0rgjIK2;
        InterfaceC214902198i interfaceC214902198i;
        C0RGJ c0rgjIK22;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                if (!this.LLILLJJLI) {
                    this.LLILLL.jP();
                    this.LLILLJJLI = true;
                }
                this.LL = this.LLILLL.sp().getCurrentItem();
                UserFeedVHProxyAbility userFeedVHProxyAbilityMp2 = this.LLILLL.mp();
                if (userFeedVHProxyAbilityMp2 != null && (c0rgjIK22 = userFeedVHProxyAbilityMp2.iK2()) != null) {
                    StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent = this.LLILLL;
                    Object value = storyImmersiveUserFeedComponent.LLLJ.getValue();
                    IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) storyImmersiveUserFeedComponent.LLLILZ.getValue();
                    value.getClass();
                    C0RGV.LIZ(c0rgjIK22, iPlayerComponentAbility);
                    return;
                }
                return;
            }
            return;
        }
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        Boolean boolValueOf = null;
        if (iDetailFeedSafService != null) {
            c128yLIZLLL = iDetailFeedSafService.LIZLLL(this.LLILLL.lp().LIZJ);
        } else {
            c128yLIZLLL = null;
        }
        if ((c128yLIZLLL instanceof InterfaceC214902198i) && (interfaceC214902198i = (InterfaceC214902198i) c128yLIZLLL) != null) {
            if (!SAFExtensionKt.LJIIZILJ(interfaceC214902198i) && !interfaceC214902198i.SL()) {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            Context context = this.LLILLL.getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                boolValueOf = Boolean.valueOf(activityLIZ.isFinishing());
            }
        }
        if (this.LL != this.LLILLL.sp().getCurrentItem() || Intrinsics.LJFF(boolValueOf, Boolean.TRUE) || (userFeedVHProxyAbilityMp = this.LLILLL.mp()) == null || (c0rgjIK2 = userFeedVHProxyAbilityMp.iK2()) == null) {
            return;
        }
        StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent2 = this.LLILLL;
        Object value2 = storyImmersiveUserFeedComponent2.LLLJ.getValue();
        IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) storyImmersiveUserFeedComponent2.LLLILZ.getValue();
        value2.getClass();
        C0RGV.LIZIZ(c0rgjIK2, iPlayerComponentAbility2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent r4 = r5.LLILLL
            r3 = 0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "onPageSelected: position = "
            r1.append(r0)     // Catch: java.lang.Throwable -> L5c
            r1.append(r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = ", nickname = "
            r1.append(r0)     // Catch: java.lang.Throwable -> L5c
            X.0SR4 r0 = r4.op()     // Catch: java.lang.Throwable -> L5c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getItem(r6)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5a
            java.lang.String r0 = r0.getNickname()     // Catch: java.lang.Throwable -> L5c
        L28:
            r1.append(r0)     // Catch: java.lang.Throwable -> L5c
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L5c
            X.0SR4 r0 = r4.op()     // Catch: java.lang.Throwable -> L5c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getItem(r6)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L58
            int r2 = r0.hashCode()     // Catch: java.lang.Throwable -> L5c
            com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility r0 = r4.Fp()     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L58
            java.util.Set r1 = r0.XG()     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L58
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r1.add(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L5c
        L54:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L5c
            goto L68
        L58:
            r0 = r3
            goto L54
        L5a:
            r0 = r3
            goto L28
        L5c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L68:
            X.C189200o6.m5exceptionOrNullimpl(r0)
            com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent r0 = r5.LLILLL
            r0.hp(r6, r3, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RT8.onPageSelected(int):void");
    }
}

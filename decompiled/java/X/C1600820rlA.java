package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.series.commonfeed.holder.PaidContentVideoViewHolder;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerPreloadDataAbility;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rlA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600820rlA {
    public final PaidContentVideoViewHolder LIZ;
    public boolean LIZIZ;

    public C1600820rlA(PaidContentVideoViewHolder paidContentVideoViewHolder) {
        this.LIZ = paidContentVideoViewHolder;
    }

    public final void LIZ(Aweme aweme) {
        Object c098200Yq;
        InterfaceC665370Q7z interfaceC665370Q7zLLIIJLIL;
        IPlayerPreloadDataAbility iPlayerPreloadDataAbility;
        if (((Number) C261220ALo.LIZ.getValue()).intValue() == 1) {
            try {
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LIZ.a1.getValue();
                if (iFeedPanelPlatformAbility != null && (interfaceC665370Q7zLLIIJLIL = iFeedPanelPlatformAbility.LLIIJLIL()) != null && (iPlayerPreloadDataAbility = (IPlayerPreloadDataAbility) C1558520qew.LIZ(interfaceC665370Q7zLLIIJLIL, IPlayerPreloadDataAbility.class, null)) != null) {
                    iPlayerPreloadDataAbility.nx1(aweme.getAid());
                }
                c098200Yq = Boolean.valueOf(C1483340ohg.LJIL(20971520, aweme));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }

    public final void LIZIZ(long j) {
        PaidContentVideoViewHolder paidContentVideoViewHolder;
        Aweme aweme;
        Video video;
        Aweme aweme2;
        Long lValueOf;
        List<Aweme> awemeList;
        int i;
        if (C1600840rlC.LIZ() && (aweme = (paidContentVideoViewHolder = this.LIZ).LLJJ) != null && Intrinsics.LJFF(paidContentVideoViewHolder.LLJILJILJ.LJIIIZ, "paid_series_detail_page") && !C695070ROf.LIZ(aweme) && !C0SFC.LIZIZ.LJIIIIZZ(aweme) && !C1611420s2G.LIZ(aweme) && (video = aweme.getVideo()) != null) {
            long duration = video.getDuration();
            if (duration > 0) {
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LIZ.a1.getValue();
                if (iFeedPanelPlatformAbility != null && (awemeList = iFeedPanelPlatformAbility.getAwemeList()) != null) {
                    Iterator<Aweme> it2 = awemeList.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (Intrinsics.LJFF(it2.next().getAid(), aweme.getAid())) {
                            if (i2 >= 0 && (i = i2 + 1) < awemeList.size() && C1611420s2G.LIZ((Aweme) ListProtector.get(awemeList, i))) {
                                int i3 = i + 1;
                                int size = awemeList.size();
                                while (true) {
                                    if (i3 >= size) {
                                        break;
                                    }
                                    aweme2 = (Aweme) ListProtector.get(awemeList, i3);
                                    if (!C1611420s2G.LIZ(aweme2)) {
                                        if (C695070ROf.LIZ(aweme2) || C0SFC.LIZIZ.LJIIIIZZ(aweme2)) {
                                            break;
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                            } else {
                                break;
                            }
                        } else {
                            i2++;
                        }
                    }
                    aweme2 = aweme;
                } else {
                    aweme2 = aweme;
                }
                float fLIZLLL = 0.0f;
                if (aweme2 == aweme) {
                    fLIZLLL = C13LZ.LIZLLL((j / duration) * 100.0f, 0.0f, 100.0f);
                }
                C1600830rlB c1600830rlB = C1600830rlB.LIZJ;
                if (c1600830rlB != null) {
                    PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
                    if (paidContentInfo != null) {
                        lValueOf = Long.valueOf(paidContentInfo.getPaidCollectionId());
                    } else {
                        lValueOf = null;
                    }
                    c1600830rlB.LIZJ(lValueOf, aweme2, fLIZLLL);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0142 A[Catch: all -> 0x0166, TryCatch #0 {all -> 0x0166, blocks: (B:39:0x0095, B:41:0x00a1, B:43:0x00a7, B:45:0x00ad, B:46:0x00b1, B:48:0x00b7, B:50:0x00bb, B:52:0x00c3, B:54:0x00cb, B:56:0x00d9, B:58:0x00df, B:60:0x00ef, B:62:0x00fd, B:64:0x010f, B:65:0x0112, B:67:0x011d, B:69:0x0127, B:71:0x013c, B:76:0x014b, B:78:0x0153, B:79:0x0156, B:81:0x015c, B:82:0x015f, B:73:0x0142, B:75:0x0148), top: B:90:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0153 A[Catch: all -> 0x0166, TryCatch #0 {all -> 0x0166, blocks: (B:39:0x0095, B:41:0x00a1, B:43:0x00a7, B:45:0x00ad, B:46:0x00b1, B:48:0x00b7, B:50:0x00bb, B:52:0x00c3, B:54:0x00cb, B:56:0x00d9, B:58:0x00df, B:60:0x00ef, B:62:0x00fd, B:64:0x010f, B:65:0x0112, B:67:0x011d, B:69:0x0127, B:71:0x013c, B:76:0x014b, B:78:0x0153, B:79:0x0156, B:81:0x015c, B:82:0x015f, B:73:0x0142, B:75:0x0148), top: B:90:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015c A[Catch: all -> 0x0166, TryCatch #0 {all -> 0x0166, blocks: (B:39:0x0095, B:41:0x00a1, B:43:0x00a7, B:45:0x00ad, B:46:0x00b1, B:48:0x00b7, B:50:0x00bb, B:52:0x00c3, B:54:0x00cb, B:56:0x00d9, B:58:0x00df, B:60:0x00ef, B:62:0x00fd, B:64:0x010f, B:65:0x0112, B:67:0x011d, B:69:0x0127, B:71:0x013c, B:76:0x014b, B:78:0x0153, B:79:0x0156, B:81:0x015c, B:82:0x015f, B:73:0x0142, B:75:0x0148), top: B:90:0x0095 }] */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSeriesInnerFeedBackSyncEvent(X.C00YC r15) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600820rlA.onSeriesInnerFeedBackSyncEvent(X.00YC):void");
    }
}

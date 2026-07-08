package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceItemBridge;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceLinkItemBridge;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceVideoItemBridge;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefWebDoc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665190Q7h {
    public static final List<ReferenceItemBridge> LIZ(List<RefSource> list, List<? extends Aweme> list2) {
        Aweme next;
        List<String> urlList;
        long diggCount;
        UrlModel cover;
        String aid;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i = 0;
            for (RefSource refSource : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    RefSource refSource2 = refSource;
                    Integer num = refSource2.type;
                    String str = "";
                    if (num != null) {
                        if (num.intValue() == 2) {
                            RefWebDoc refWebDoc = refSource2.webDoc;
                            if (refWebDoc != null) {
                                String str2 = refWebDoc.webLink;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String str3 = refWebDoc.webName;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                String str4 = refWebDoc.webTitle;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                String str5 = refWebDoc.webSummary;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                String str6 = refWebDoc.webIcon;
                                if (str6 != null) {
                                    str = str6;
                                }
                                arrayList.add(new ReferenceItemBridge(i2, 0, new ReferenceLinkItemBridge(str2, str3, str4, str5, str), null));
                            }
                        } else if (num.intValue() == 1 && list2 != null) {
                            Iterator<? extends Aweme> it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    Aweme aweme = next;
                                    if (aweme != null) {
                                        aid = aweme.getAid();
                                    } else {
                                        aid = null;
                                    }
                                    if (Intrinsics.LJFF(aid, refSource2.awemeId)) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            Aweme aweme2 = next;
                            if (aweme2 != null) {
                                String str7 = refSource2.awemeId;
                                if (str7 != null) {
                                    str = str7;
                                }
                                Video video = aweme2.getVideo();
                                if (video == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null) {
                                    urlList = C13BV.INSTANCE;
                                }
                                AwemeStatistics statistics = aweme2.getStatistics();
                                if (statistics != null) {
                                    diggCount = statistics.getDiggCount();
                                } else {
                                    diggCount = 0;
                                }
                                arrayList.add(new ReferenceItemBridge(i2, 1, null, new ReferenceVideoItemBridge(str, diggCount, urlList)));
                            }
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return arrayList;
    }
}

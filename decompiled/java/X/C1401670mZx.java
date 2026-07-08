package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse;
import com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0mZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1401670mZx extends AbstractC1255880imo<Aweme, VoiceConversionDetailsResponse> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(414));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(699));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        VoiceConversionStruct voiceConversionStruct;
        VoiceConversionDetailsResponse voiceConversionDetailsResponse = (VoiceConversionDetailsResponse) this.mData;
        if (voiceConversionDetailsResponse == null || (voiceConversionStruct = voiceConversionDetailsResponse.videoDetail) == null) {
            return null;
        }
        return voiceConversionStruct.videoList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        List<Aweme> items;
        VoiceConversionStruct voiceConversionStruct;
        Integer num;
        VoiceConversionDetailsResponse voiceConversionDetailsResponse = (VoiceConversionDetailsResponse) this.mData;
        return (voiceConversionDetailsResponse == null || (voiceConversionStruct = voiceConversionDetailsResponse.videoDetail) == null || (num = voiceConversionStruct.hasMore) == null || num.intValue() != 1) && ((items = getItems()) == null || items.isEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        VoiceConversionStruct voiceConversionStruct;
        Integer num;
        VoiceConversionDetailsResponse voiceConversionDetailsResponse = (VoiceConversionDetailsResponse) this.mData;
        return (voiceConversionDetailsResponse == null || (voiceConversionStruct = voiceConversionDetailsResponse.videoDetail) == null || (num = voiceConversionStruct.hasMore) == null || num.intValue() != 1) ? false : true;
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr.length >= 3) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1255880imo
    public final boolean deleteItem(Aweme aweme) {
        return C729980SkG.LIZIZ(getItems(), aweme, this.mNotifyListeners);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse] */
    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        VoiceConversionStruct voiceConversionStruct;
        VoiceConversionStruct voiceConversionStruct2;
        int i;
        VoiceConversionStruct voiceConversionStruct3;
        List<Aweme> list;
        List arrayList;
        VoiceConversionStruct voiceConversionStruct4;
        List<Aweme> list2;
        List<Aweme> list3;
        Integer num;
        VoiceConversionStruct voiceConversionStruct5;
        long jLongValue;
        VoiceConversionStruct voiceConversionStruct6;
        Long l;
        ?? r9 = (VoiceConversionDetailsResponse) obj;
        C1401700ma0 c1401700ma0 = (C1401700ma0) this.LLILLJJLI.getValue();
        if (c1401700ma0.LIZLLL) {
            long j = c1401700ma0.LIZIZ;
            if (j == 0) {
                LruCache<String, C1401690mZz> lruCache = C1401680mZy.LIZ;
                String str = c1401700ma0.LIZ;
                int i2 = c1401700ma0.LIZJ;
                if (r9 != 0 && (voiceConversionStruct6 = r9.videoDetail) != null && (l = voiceConversionStruct6.videoCount) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = -1;
                }
                LruCache<String, C1401690mZz> lruCache2 = C1401680mZy.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('&');
                sbLIZ.append(j);
                sbLIZ.append('&');
                sbLIZ.append(i2);
                sbLIZ.append('&');
                sbLIZ.append(jLongValue);
                lruCache2.put(C2188811AlT.LIZIZ(sbLIZ), new C1401690mZz(r9, System.currentTimeMillis()));
            }
        }
        Long l2 = null;
        if (r9 != 0) {
            voiceConversionStruct = r9.videoDetail;
        } else {
            voiceConversionStruct = null;
        }
        if (voiceConversionStruct != null) {
            List<Aweme> list4 = voiceConversionStruct.videoList;
            if (list4 != null && list4.isEmpty() && (num = voiceConversionStruct.hasMore) != null && num.intValue() == 0) {
                VoiceConversionDetailsResponse voiceConversionDetailsResponse = (VoiceConversionDetailsResponse) this.mData;
                if (voiceConversionDetailsResponse != null && (voiceConversionStruct5 = voiceConversionDetailsResponse.videoDetail) != null) {
                    voiceConversionStruct5.hasMore = 0;
                    return;
                }
                return;
            }
            List<Aweme> list5 = voiceConversionStruct.videoList;
            if (list5 != null) {
                int i3 = 0;
                for (Aweme aweme : list5) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        Aweme awemeLLILLL = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                        if (awemeLLILLL != null && (list3 = voiceConversionStruct.videoList) != null) {
                            ListProtector.set(list3, i3, awemeLLILLL);
                        }
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        int i5 = this.mListQueryType;
        if (i5 != 1) {
            if (i5 != 4) {
                return;
            }
            if (voiceConversionStruct != null && (list = voiceConversionStruct.videoList) != null) {
                VoiceConversionDetailsResponse voiceConversionDetailsResponse2 = (VoiceConversionDetailsResponse) this.mData;
                if (voiceConversionDetailsResponse2 != null && (voiceConversionStruct4 = voiceConversionDetailsResponse2.videoDetail) != null && (list2 = voiceConversionStruct4.videoList) != null && list2.isEmpty()) {
                    VoiceConversionStruct voiceConversionStruct7 = ((VoiceConversionDetailsResponse) this.mData).videoDetail;
                    if (voiceConversionStruct7 != null) {
                        voiceConversionStruct7.videoList = list;
                    }
                } else {
                    VoiceConversionStruct voiceConversionStruct8 = ((VoiceConversionDetailsResponse) this.mData).videoDetail;
                    if (voiceConversionStruct8 == null || (arrayList = voiceConversionStruct8.videoList) == null) {
                        arrayList = new ArrayList();
                    }
                    C188700o1.LIZ(arrayList, list, AnonymousClass0208.get$arr$(81));
                }
            }
            VoiceConversionDetailsResponse voiceConversionDetailsResponse3 = (VoiceConversionDetailsResponse) this.mData;
            if (voiceConversionDetailsResponse3 != null && (voiceConversionStruct3 = voiceConversionDetailsResponse3.videoDetail) != null) {
                if (voiceConversionStruct != null) {
                    l2 = voiceConversionStruct.cursor;
                }
                new VoiceConversionStruct(voiceConversionStruct3.voiceId, voiceConversionStruct3.description, voiceConversionStruct3.iconUrl, voiceConversionStruct3.previewAudioUrl, voiceConversionStruct3.showCreatorProfile, voiceConversionStruct3.creatorUserId, voiceConversionStruct3.creatorUserName, voiceConversionStruct3.videoCount, voiceConversionStruct3.videoList, voiceConversionStruct3.hasMore, l2);
            }
            VoiceConversionDetailsResponse voiceConversionDetailsResponse4 = (VoiceConversionDetailsResponse) this.mData;
            if (voiceConversionDetailsResponse4 == null || (voiceConversionStruct2 = voiceConversionDetailsResponse4.videoDetail) == null) {
                return;
            }
            if (voiceConversionStruct == null || (i = voiceConversionStruct.hasMore) == null) {
                Integer num2 = voiceConversionStruct2.hasMore;
                if (num2 != null) {
                    num2.intValue();
                }
                i = 0;
            }
            voiceConversionStruct2.hasMore = i;
            return;
        }
        this.mData = r9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        long jLongValue;
        VoiceConversionDetailsResponse voiceConversionDetailsResponse;
        VoiceConversionStruct voiceConversionStruct;
        Long l;
        String str = (String) objArr[1];
        if (!isDataEmpty() && (voiceConversionDetailsResponse = (VoiceConversionDetailsResponse) this.mData) != null && (voiceConversionStruct = voiceConversionDetailsResponse.videoDetail) != null && (l = voiceConversionStruct.cursor) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        LJIIJ(jLongValue, str, false);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        if (objArr.length >= 6) {
            LJIIJ(0L, (String) objArr[1], ((Boolean) objArr[5]).booleanValue());
        } else {
            LJIIJ(0L, (String) objArr[1], false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse] */
    @Override // X.AbstractC1255880imo
    public final void setItems(List<Aweme> list) {
        VoiceConversionStruct voiceConversionStruct;
        T t = this.mData;
        if (t == 0) {
            this.mData = new VoiceConversionDetailsResponse(0, "", null, new VoiceConversionStruct("", "", null, null, false, 0L, "", 0L, list, 1, 0L));
            return;
        }
        VoiceConversionDetailsResponse voiceConversionDetailsResponse = (VoiceConversionDetailsResponse) t;
        if (voiceConversionDetailsResponse == null || (voiceConversionStruct = voiceConversionDetailsResponse.videoDetail) == null) {
            return;
        }
        voiceConversionStruct.hasMore = 1;
        voiceConversionStruct.videoList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(final long r8, final java.lang.String r10, boolean r11) {
        /*
            r7 = this;
            X.01GW r0 = r7.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            X.0ma0 r0 = (X.C1401700ma0) r0
            r0.LIZ = r10
            r0.LIZIZ = r8
            r5 = 20
            r0.LIZJ = r5
            r0 = 0
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L90
            if (r11 != 0) goto L90
            android.util.LruCache<java.lang.String, X.0mZz> r0 = X.C1401680mZy.LIZ
            T r0 = r7.mData
            com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse r0 = (com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse) r0
            if (r0 == 0) goto L8d
            com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionStruct r0 = r0.videoDetail
            if (r0 == 0) goto L8d
            java.lang.Long r0 = r0.videoCount
            if (r0 == 0) goto L8d
            long r1 = r0.longValue()
        L2c:
            android.util.LruCache<java.lang.String, X.0mZz> r4 = X.C1401680mZy.LIZ
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            r3.append(r10)
            r0 = 38
            r3.append(r0)
            r3.append(r8)
            r3.append(r0)
            r3.append(r5)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)
            java.lang.Object r5 = r4.get(r0)
            X.0mZz r5 = (X.C1401690mZz) r5
            if (r5 == 0) goto L90
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r5.LIZIZ
            long r3 = r3 - r0
            r0 = 15000(0x3a98, float:2.102E-41)
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L90
            com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse r1 = r5.LIZ
        L65:
            r3 = 0
            if (r1 == 0) goto L92
            X.01GW r0 = r7.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            X.0ma0 r0 = (X.C1401700ma0) r0
            r0.LIZLLL = r3
            android.os.Message r3 = new android.os.Message
            r3.<init>()
            r3.obj = r1
            com.bytedance.bpea.transmit.delegate.BPEAHandler r2 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0)
            Y.ARunnableS88S0200000_19 r1 = new Y.ARunnableS88S0200000_19
            r0 = 67
            r1.<init>(r7, r3, r0)
            X.C786410Ut5.LJJZZIII(r2, r1)
            return
        L8d:
            r1 = -1
            goto L2c
        L90:
            r1 = 0
            goto L65
        L92:
            if (r6 != 0) goto L9f
            X.01GW r0 = r7.LLILLJJLI
            java.lang.Object r1 = r0.getValue()
            X.0ma0 r1 = (X.C1401700ma0) r1
            r0 = 1
            r1.LIZLLL = r0
        L9f:
            X.1BVK r2 = X.C1BVK.LIZIZ()
            com.bytedance.common.utility.collection.WeakHandler r1 = r7.mHandler
            X.0JBp r0 = new X.0JBp
            r0.<init>()
            r2.LIZ(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1401670mZx.LJIIJ(long, java.lang.String, boolean):void");
    }
}

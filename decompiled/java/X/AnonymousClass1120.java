package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse;
import com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.1120, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1120 extends AbstractC1255880imo<Aweme, TTSVoiceDetailsResponse> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(348));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(441));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        List<TTSVoiceStruct> list;
        TTSVoiceStruct tTSVoiceStruct;
        TTSVoiceDetailsResponse tTSVoiceDetailsResponse = (TTSVoiceDetailsResponse) this.mData;
        if (tTSVoiceDetailsResponse == null || (list = tTSVoiceDetailsResponse.ttsVoiceStruct) == null || (tTSVoiceStruct = (TTSVoiceStruct) C13LP.LJJJLL(list)) == null) {
            return null;
        }
        return tTSVoiceStruct.videoList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        List<Aweme> items;
        List<TTSVoiceStruct> list;
        TTSVoiceStruct tTSVoiceStruct;
        Integer num;
        TTSVoiceDetailsResponse tTSVoiceDetailsResponse = (TTSVoiceDetailsResponse) this.mData;
        return (tTSVoiceDetailsResponse == null || (list = tTSVoiceDetailsResponse.ttsVoiceStruct) == null || (tTSVoiceStruct = (TTSVoiceStruct) C13LP.LJJJLL(list)) == null || (num = tTSVoiceStruct.hasMore) == null || num.intValue() != 1) && ((items = getItems()) == null || items.isEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        List<TTSVoiceStruct> list;
        TTSVoiceStruct tTSVoiceStruct;
        Integer num;
        TTSVoiceDetailsResponse tTSVoiceDetailsResponse = (TTSVoiceDetailsResponse) this.mData;
        return (tTSVoiceDetailsResponse == null || (list = tTSVoiceDetailsResponse.ttsVoiceStruct) == null || (tTSVoiceStruct = (TTSVoiceStruct) C13LP.LJJJLL(list)) == null || (num = tTSVoiceStruct.hasMore) == null || num.intValue() != 1) ? false : true;
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
    /* JADX WARN: Type inference failed for: r9v1, types: [T, com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse] */
    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        TTSVoiceStruct tTSVoiceStruct;
        List<TTSVoiceStruct> list;
        TTSVoiceStruct tTSVoiceStruct2;
        int i;
        List<TTSVoiceStruct> list2;
        TTSVoiceStruct tTSVoiceStruct3;
        Integer num;
        List<TTSVoiceStruct> list3;
        TTSVoiceStruct tTSVoiceStruct4;
        List<Aweme> list4;
        List arrayList;
        TTSVoiceStruct tTSVoiceStruct5;
        List<TTSVoiceStruct> list5;
        TTSVoiceStruct tTSVoiceStruct6;
        List<Aweme> list6;
        TTSVoiceStruct tTSVoiceStruct7;
        Integer num2;
        List<TTSVoiceStruct> list7;
        TTSVoiceStruct tTSVoiceStruct8;
        List<TTSVoiceStruct> list8;
        int i2;
        int iIntValue;
        List<TTSVoiceStruct> list9;
        TTSVoiceStruct tTSVoiceStruct9;
        Integer num3;
        ?? r9 = (TTSVoiceDetailsResponse) obj;
        AnonymousClass1122 anonymousClass1122 = (AnonymousClass1122) this.LLILLJJLI.getValue();
        if (anonymousClass1122.LIZLLL && (i2 = anonymousClass1122.LIZIZ) == 0) {
            LruCache<String, AnonymousClass1121> lruCache = C1867290ygx.LIZ;
            String str = anonymousClass1122.LIZ;
            int i3 = anonymousClass1122.LIZJ;
            if (r9 != 0 && (list9 = r9.ttsVoiceStruct) != null && (tTSVoiceStruct9 = (TTSVoiceStruct) C13LP.LJJJLL(list9)) != null && (num3 = tTSVoiceStruct9.videoCount) != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = -1;
            }
            LruCache<String, AnonymousClass1121> lruCache2 = C1867290ygx.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('&');
            sbLIZ.append(i2);
            sbLIZ.append('&');
            sbLIZ.append(i3);
            sbLIZ.append('&');
            sbLIZ.append(iIntValue);
            lruCache2.put(C2188811AlT.LIZIZ(sbLIZ), new AnonymousClass1121(r9, System.currentTimeMillis()));
        }
        Integer num4 = null;
        if (r9 != 0 && (list8 = r9.ttsVoiceStruct) != null) {
            tTSVoiceStruct = (TTSVoiceStruct) C13LP.LJJJLL(list8);
        } else {
            tTSVoiceStruct = null;
        }
        if (tTSVoiceStruct != null) {
            List<Aweme> list10 = tTSVoiceStruct.videoList;
            if (list10 != null && list10.isEmpty() && (num2 = tTSVoiceStruct.hasMore) != null && num2.intValue() == 0) {
                TTSVoiceDetailsResponse tTSVoiceDetailsResponse = (TTSVoiceDetailsResponse) this.mData;
                if (tTSVoiceDetailsResponse != null && (list7 = tTSVoiceDetailsResponse.ttsVoiceStruct) != null && (tTSVoiceStruct8 = (TTSVoiceStruct) C13LP.LJJJLL(list7)) != null) {
                    tTSVoiceStruct8.hasMore = 0;
                    return;
                }
                return;
            }
            List<Aweme> list11 = tTSVoiceStruct.videoList;
            if (list11 != null) {
                int i4 = 0;
                for (Aweme aweme : list11) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        Aweme awemeLLILLL = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                        List<Aweme> list12 = tTSVoiceStruct.videoList;
                        if (list12 != null) {
                            ListProtector.set(list12, i4, awemeLLILLL);
                        }
                        i4 = i5;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        int i6 = this.mListQueryType;
        if (i6 != 1) {
            if (i6 != 4) {
                return;
            }
            if (tTSVoiceStruct != null && (list4 = tTSVoiceStruct.videoList) != null) {
                TTSVoiceDetailsResponse tTSVoiceDetailsResponse2 = (TTSVoiceDetailsResponse) this.mData;
                if (tTSVoiceDetailsResponse2 != null && (list5 = tTSVoiceDetailsResponse2.ttsVoiceStruct) != null && (tTSVoiceStruct6 = (TTSVoiceStruct) C13LP.LJJJLL(list5)) != null && (list6 = tTSVoiceStruct6.videoList) != null && list6.isEmpty()) {
                    List<TTSVoiceStruct> list13 = ((TTSVoiceDetailsResponse) this.mData).ttsVoiceStruct;
                    if (list13 != null && (tTSVoiceStruct7 = (TTSVoiceStruct) C13LP.LJJJLL(list13)) != null) {
                        tTSVoiceStruct7.videoList = list4;
                    }
                } else {
                    List<TTSVoiceStruct> list14 = ((TTSVoiceDetailsResponse) this.mData).ttsVoiceStruct;
                    if (list14 == null || (tTSVoiceStruct5 = (TTSVoiceStruct) C13LP.LJJJLL(list14)) == null || (arrayList = tTSVoiceStruct5.videoList) == null) {
                        arrayList = new ArrayList();
                    }
                    C188700o1.LIZ(arrayList, list4, AnonymousClass0208.get$arr$(62));
                }
            }
            TTSVoiceDetailsResponse tTSVoiceDetailsResponse3 = (TTSVoiceDetailsResponse) this.mData;
            if (tTSVoiceDetailsResponse3 != null && (list3 = tTSVoiceDetailsResponse3.ttsVoiceStruct) != null && (tTSVoiceStruct4 = (TTSVoiceStruct) C13LP.LJJJLL(list3)) != null) {
                if (tTSVoiceStruct != null) {
                    num4 = tTSVoiceStruct.cursor;
                }
                new TTSVoiceStruct(tTSVoiceStruct4.voiceId, tTSVoiceStruct4.description, tTSVoiceStruct4.iconUrl, tTSVoiceStruct4.previewAudioUrl, tTSVoiceStruct4.videoCount, tTSVoiceStruct4.videoList, tTSVoiceStruct4.hasMore, num4, tTSVoiceStruct4.creatorUserId, tTSVoiceStruct4.creatorUserName, tTSVoiceStruct4.showCreatorProfile);
            }
            TTSVoiceDetailsResponse tTSVoiceDetailsResponse4 = (TTSVoiceDetailsResponse) this.mData;
            if (tTSVoiceDetailsResponse4 == null || (list = tTSVoiceDetailsResponse4.ttsVoiceStruct) == null || (tTSVoiceStruct2 = (TTSVoiceStruct) C13LP.LJJJLL(list)) == null) {
                return;
            }
            if (tTSVoiceStruct == null || (i = tTSVoiceStruct.hasMore) == null) {
                TTSVoiceDetailsResponse tTSVoiceDetailsResponse5 = (TTSVoiceDetailsResponse) this.mData;
                if (tTSVoiceDetailsResponse5 != null && (list2 = tTSVoiceDetailsResponse5.ttsVoiceStruct) != null && (tTSVoiceStruct3 = (TTSVoiceStruct) C13LP.LJJJLL(list2)) != null && (num = tTSVoiceStruct3.hasMore) != null) {
                    num.intValue();
                }
                i = 0;
            }
            tTSVoiceStruct2.hasMore = i;
            return;
        }
        this.mData = r9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        int iIntValue;
        TTSVoiceDetailsResponse tTSVoiceDetailsResponse;
        List<TTSVoiceStruct> list;
        TTSVoiceStruct tTSVoiceStruct;
        Integer num;
        String str = (String) objArr[1];
        if (!isDataEmpty() && (tTSVoiceDetailsResponse = (TTSVoiceDetailsResponse) this.mData) != null && (list = tTSVoiceDetailsResponse.ttsVoiceStruct) != null && (tTSVoiceStruct = (TTSVoiceStruct) C13LP.LJJJLL(list)) != null && (num = tTSVoiceStruct.cursor) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        LJIIJ(iIntValue, 20, str, false);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        if (objArr.length >= 6) {
            LJIIJ(0, 20, (String) objArr[1], ((Boolean) objArr[5]).booleanValue());
        } else {
            LJIIJ(0, 20, (String) objArr[1], false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [T, com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse] */
    @Override // X.AbstractC1255880imo
    public final void setItems(List<Aweme> list) {
        List<TTSVoiceStruct> list2;
        TTSVoiceStruct tTSVoiceStruct;
        T t = this.mData;
        if (t == 0) {
            this.mData = new TTSVoiceDetailsResponse(null, null, Collections.singletonList(new TTSVoiceStruct("", "", null, null, 0, list, 1, 0, "", "", false)), 3, null);
            return;
        }
        TTSVoiceDetailsResponse tTSVoiceDetailsResponse = (TTSVoiceDetailsResponse) t;
        if (tTSVoiceDetailsResponse == null || (list2 = tTSVoiceDetailsResponse.ttsVoiceStruct) == null || (tTSVoiceStruct = (TTSVoiceStruct) C13LP.LJJJLL(list2)) == null) {
            return;
        }
        tTSVoiceStruct.hasMore = 1;
        tTSVoiceStruct.videoList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(final int r7, int r8, final java.lang.String r9, boolean r10) {
        /*
            r6 = this;
            X.01GW r0 = r6.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            X.1122 r0 = (X.AnonymousClass1122) r0
            r0.LIZ = r9
            r0.LIZIZ = r7
            r4 = 20
            r0.LIZJ = r4
            if (r7 != 0) goto L93
            if (r10 != 0) goto L93
            android.util.LruCache<java.lang.String, X.1121> r0 = X.C1867290ygx.LIZ
            T r0 = r6.mData
            com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse r0 = (com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse) r0
            if (r0 == 0) goto L91
            java.util.List<com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceStruct> r0 = r0.ttsVoiceStruct
            if (r0 == 0) goto L91
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceStruct r0 = (com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceStruct) r0
            if (r0 == 0) goto L91
            java.lang.Integer r0 = r0.videoCount
            if (r0 == 0) goto L91
            int r3 = r0.intValue()
        L30:
            android.util.LruCache<java.lang.String, X.1121> r2 = X.C1867290ygx.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r9)
            r0 = 38
            r1.append(r0)
            r1.append(r7)
            r1.append(r0)
            r1.append(r4)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.Object r5 = r2.get(r0)
            X.1121 r5 = (X.AnonymousClass1121) r5
            if (r5 == 0) goto L93
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r5.LIZIZ
            long r3 = r3 - r0
            r0 = 15000(0x3a98, float:2.102E-41)
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L93
            com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse r1 = r5.LIZ
        L69:
            r3 = 0
            if (r1 == 0) goto L95
            X.01GW r0 = r6.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            X.1122 r0 = (X.AnonymousClass1122) r0
            r0.LIZLLL = r3
            android.os.Message r3 = new android.os.Message
            r3.<init>()
            r3.obj = r1
            com.bytedance.bpea.transmit.delegate.BPEAHandler r2 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0)
            Y.ARunnableS88S0200000_19 r1 = new Y.ARunnableS88S0200000_19
            r0 = 64
            r1.<init>(r6, r3, r0)
            X.C786410Ut5.LJJZZIII(r2, r1)
            return
        L91:
            r3 = -1
            goto L30
        L93:
            r1 = 0
            goto L69
        L95:
            if (r7 != 0) goto La2
            X.01GW r0 = r6.LLILLJJLI
            java.lang.Object r1 = r0.getValue()
            X.1122 r1 = (X.AnonymousClass1122) r1
            r0 = 1
            r1.LIZLLL = r0
        La2:
            X.1BVK r2 = X.C1BVK.LIZIZ()
            com.bytedance.common.utility.collection.WeakHandler r1 = r6.mHandler
            X.0JBk r0 = new X.0JBk
            r0.<init>()
            r2.LIZ(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1120.LJIIJ(int, int, java.lang.String, boolean):void");
    }
}

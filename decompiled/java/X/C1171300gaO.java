package X;

import Y.AfS0S0120100_18;
import Y.AfS187S0100000_18;
import Y.AfS37S1000000_18;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.experiment.CollectionAddVideosNullProtectExpModel;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0gaO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171300gaO implements InterfaceC1170280gYk {
    public final /* synthetic */ C1171340gaS LL;

    public C1171300gaO(C1171340gaS c1171340gaS) {
        this.LL = c1171340gaS;
    }

    @Override // X.InterfaceC1170280gYk
    public final C11JN LL(String str) {
        return this.LL.LL.LJ(str).LJJIJIIJIL(new C09JN() { // from class: X.01cs
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionDetail$1");
                ((AbstractC2126608Uu) obj).checkValid();
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionDetail$1");
            }
        }).LJJIJIIJIL(new C09JN() { // from class: X.0O96
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionDetail$2");
                C1206780hVc.LIZJ("/tiktok/collection/item_archive/detail/v1", "net", (BaseResponse) obj);
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionDetail$2");
            }
        }).LJJIJIIJI(new C09JN() { // from class: X.0O97
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionDetail$3");
                C1206780hVc.LIZIZ("/tiktok/collection/item_archive/detail/v1", (Throwable) obj);
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionDetail$3");
            }
        });
    }

    @Override // X.InterfaceC1170280gYk
    public final C11JN LLIZ(long j) {
        int iIntValue;
        int i;
        Integer num = ((CollectionAddVideosNullProtectExpModel) C1170590gZF.LIZIZ.getValue()).fetchNum;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 30;
        }
        InterfaceC1171320gaQ interfaceC1171320gaQ = this.LL.LL;
        if (j == 0) {
            i = 1;
        } else {
            i = 2;
        }
        return interfaceC1171320gaQ.LIZLLL(j, iIntValue, i).LJJIJIIJIL(new C09JN() { // from class: X.01cq
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCandidateContent$1");
                ((AbstractC2126608Uu) obj).checkValid();
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCandidateContent$1");
            }
        }).LJJIJIIJIL(new C09JN() { // from class: X.0O94
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCandidateContent$2");
                C1206780hVc.LIZJ("/tiktok/collection/item_archive/item/candidate/list/v1", "net", (BaseResponse) obj);
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCandidateContent$2");
            }
        }).LJJIJIIJI(new C09JN() { // from class: X.0O95
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCandidateContent$3");
                C1206780hVc.LIZIZ("/tiktok/collection/item_archive/item/candidate/list/v1", (Throwable) obj);
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCandidateContent$3");
            }
        });
    }

    public final boolean LLJLILLLLZIIL(Boolean bool) {
        String string;
        String string2;
        if (Intrinsics.LJFF(bool, Boolean.TRUE) && C0A17.LIZ()) {
            Keva keva = this.LL.LLILLJJLI;
            if (keva == null || (string2 = keva.getString("CollectionCacheLS", "")) == null || string2.length() == 0) {
                return true;
            }
            return false;
        }
        Keva keva2 = this.LL.LLILLJJLI;
        if (keva2 == null || (string = keva2.getString("CollectionCache", "")) == null || string.length() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1170280gYk
    public final C11JN LLJLLIL(long j) {
        return this.LL.LL.LJIIIZ(j, 30).LJJIJIIJIL(new C09JN() { // from class: X.01co
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getAllFavoritesContent$1");
                ((AbstractC2126608Uu) obj).checkValid();
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getAllFavoritesContent$1");
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.00DR
            /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
            @Override // X.InterfaceC1487280oo2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteContentResponse r6 = (com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteContentResponse) r6
                    com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse r4 = new com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse
                    java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r6.items
                    java.lang.Long r2 = r6.maxCursor
                    java.lang.Integer r0 = r6.hasMore
                    if (r0 == 0) goto L1b
                    int r0 = r0.intValue()
                    r1 = 1
                    if (r0 != r1) goto L1b
                L13:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    r4.<init>(r3, r2, r0)
                    return r4
                L1b:
                    r1 = 0
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C00DR.apply(java.lang.Object):java.lang.Object");
            }
        }).LJJIJIIJIL(new C09JN() { // from class: X.0gaT
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getAllFavoritesContent$3");
                C1206780hVc.LIZJ("/aweme/v1/aweme/listcollection/", "net", (BaseResponse) obj);
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getAllFavoritesContent$3");
            }
        }).LJJIJIIJI(new C09JN() { // from class: X.0gaU
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getAllFavoritesContent$4");
                C1206780hVc.LIZIZ("/aweme/v1/aweme/listcollection/", (Throwable) obj);
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getAllFavoritesContent$4");
            }
        });
    }

    @Override // X.InterfaceC1170280gYk
    public final C11JN LLLLZLLLI(int i) {
        return this.LL.LL.LIZIZ(i).LJJIJIIJIL(new C09JN() { // from class: X.01cp
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getAllFavoritesDetail$1");
                ((AbstractC2126608Uu) obj).checkValid();
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getAllFavoritesDetail$1");
            }
        });
    }

    @Override // X.InterfaceC1170280gYk
    public final C11JN LLLLII(long j, String str) {
        int i;
        InterfaceC1171320gaQ interfaceC1171320gaQ = this.LL.LL;
        if (j == 0) {
            i = 1;
        } else {
            i = 2;
        }
        return interfaceC1171320gaQ.LJFF(str, j, 30, i).LJJIJIIJIL(new C09JN() { // from class: X.01cr
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionContent$1");
                ((AbstractC2126608Uu) obj).checkValid();
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionContent$1");
            }
        }).LJJIJIIJIL(new C09JN() { // from class: X.0O9R
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionContent$2");
                C1206780hVc.LIZJ("/tiktok/collection/item_archive/item/list/v1", "net", (BaseResponse) obj);
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionContent$2");
            }
        }).LJJIJIIJI(new C09JN() { // from class: X.0O9S
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionContent$3");
                C1206780hVc.LIZIZ("/tiktok/collection/item_archive/item/list/v1", (Throwable) obj);
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionContent$3");
            }
        });
    }

    public final C11JN LLZLLIL(CollectionManageRequest collectionManageRequest, boolean z) {
        String string;
        String string2;
        String string3;
        String string4;
        InterfaceC1171320gaQ interfaceC1171320gaQ = this.LL.LL;
        int i = collectionManageRequest.operation;
        String str = collectionManageRequest.collectionId;
        String str2 = collectionManageRequest.collectionName;
        String string5 = null;
        if (str2 != null) {
            string = a0.LJLIIIL(str2).toString();
        } else {
            string = null;
        }
        String str3 = collectionManageRequest.moveFromCollectionId;
        String str4 = collectionManageRequest.moveToCollectionId;
        List<String> list = collectionManageRequest.addIds;
        if (list != null) {
            string2 = list.toString();
        } else {
            string2 = null;
        }
        List<String> list2 = collectionManageRequest.removeIds;
        if (list2 != null) {
            string3 = list2.toString();
        } else {
            string3 = null;
        }
        List<String> list3 = collectionManageRequest.moveIds;
        if (list3 != null) {
            string5 = list3.toString();
        }
        Integer num = collectionManageRequest.status;
        List<String> list4 = collectionManageRequest.collaborativeUids;
        if (list4 == null || (string4 = list4.toString()) == null) {
            string4 = "";
        }
        return interfaceC1171320gaQ.LJI(i, str, string, str3, str4, string2, string3, string5, num, string4, collectionManageRequest.type, collectionManageRequest.isImmediateAddAfterCreate).LJJIJIIJIL(new C515501zd(this, z, 4)).LJJLIIIJLJLI(new C1088090eQB()).LJJIJIIJIL(new AfS187S0100000_18(collectionManageRequest, 9)).LJJIJIIJI(new AfS187S0100000_18(collectionManageRequest, 10));
    }

    public static void LJLZ(CollectionListResponse collectionListResponse, boolean z, boolean z2, long j) {
        CollectionDetail next;
        List<CollectionDetail> list;
        if (C0A17.LIZ() && j == 0 && z) {
            List<CollectionDetail> list2 = collectionListResponse.pinSection;
            if (list2 != null) {
                Iterator<CollectionDetail> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        Integer num = next.type;
                        if (num != null && num.intValue() == 1) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
            } else {
                next = null;
            }
            C1367960lha.LIZ.getClass();
            if (C1367960lha.LIZ().canShowWantTogoCollection()) {
                if (z2 && (list = collectionListResponse.items) != null) {
                    Iterator<CollectionDetail> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        CollectionDetail next2 = it3.next();
                        Integer num2 = next2.type;
                        if (num2 != null && num2.intValue() == 1) {
                            if (next2 != null) {
                                List<CollectionDetail> list3 = collectionListResponse.items;
                                if (C19719512Dh.LJI(list3) && list3 != null) {
                                    list3.remove(next2);
                                }
                            }
                        }
                    }
                }
                if (next == null) {
                    if (collectionListResponse.items == null) {
                        collectionListResponse.items = new ArrayList();
                    }
                    List<CollectionDetail> list4 = collectionListResponse.items;
                    if (C19719512Dh.LJI(list4) && list4 != null) {
                        ListProtector.add(list4, 0, new CollectionDetail(null, C20642515q3.LJI(2131844695), null, new CollectionDetail.Status(1), null, null, null, null, null, null, 1));
                        return;
                    }
                    return;
                }
                List<CollectionDetail> list5 = collectionListResponse.items;
                if (!C19719512Dh.LJI(list5) || list5 == null) {
                    return;
                }
                ListProtector.add(list5, 0, next);
            }
        }
    }

    @Override // X.InterfaceC1170280gYk
    public final C11JN u0(long j, String str, boolean z, final String str2, final String str3, boolean z2, final boolean z3, boolean z4) {
        String string;
        Boolean boolValueOf;
        C11NZ c11nzLJJIJIIJIL;
        Boolean boolValueOf2;
        String str4;
        Keva keva = this.LL.LLILLJJLI;
        String string2 = null;
        if (keva != null) {
            if (!z3 || !C0A17.LIZ()) {
                str4 = "CollectionCache";
            } else {
                str4 = "CollectionCacheLS";
            }
            string = keva.getString(str4, "");
        } else {
            string = null;
        }
        if (j == 0) {
            InterfaceC1171320gaQ interfaceC1171320gaQ = this.LL.LL;
            if (C0A17.LIZ()) {
                boolValueOf2 = Boolean.valueOf(z3);
            } else {
                boolValueOf2 = null;
            }
            C11NZ<CollectionListResponse> c11nzLIZ = interfaceC1171320gaQ.LIZ(j, 30, str2, "", str, str3, z2, boolValueOf2);
            final C1171340gaS c1171340gaS = this.LL;
            c11nzLJJIJIIJIL = c11nzLIZ.LJJIJIIJIL(new C09JN() { // from class: X.0Cty
                /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.String r3 = "VideoCollectionModel@1b33.operator$1$getVideoCollectionList$res$1"
                        X.C1C7U.LIZ(r3)
                        X.08Uu r11 = (X.AbstractC2126608Uu) r11
                        r11.checkValid()
                        java.lang.String r1 = r1
                        if (r1 == 0) goto L2e
                        java.lang.Class<com.ss.android.ugc.aweme.IAccountService> r4 = com.ss.android.ugc.aweme.IAccountService.class
                        r5 = 0
                        r8 = 14
                        r9 = 0
                        r6 = r5
                        r7 = r5
                        java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
                        com.ss.android.ugc.aweme.IAccountService r0 = (com.ss.android.ugc.aweme.IAccountService) r0
                        if (r0 == 0) goto L64
                        com.ss.android.ugc.aweme.AccountUserService r0 = r0.LJIIJ()
                        if (r0 == 0) goto L64
                        java.lang.String r0 = r0.getCurUserId()
                    L28:
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 == 0) goto L60
                    L2e:
                        java.lang.String r0 = r2
                        if (r0 == 0) goto L38
                        int r0 = r0.length()
                        if (r0 != 0) goto L60
                    L38:
                        com.google.gson.Gson r0 = X.C09C2.LIZ()
                        java.lang.String r2 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r11)
                        X.0gaS r0 = r3
                        com.bytedance.keva.Keva r1 = r0.LLILLJJLI
                        if (r1 == 0) goto L4b
                        java.lang.String r0 = "CollectionCache"
                        r1.storeString(r0, r2)
                    L4b:
                        boolean r0 = r4
                        if (r0 == 0) goto L60
                        boolean r0 = X.C0A17.LIZ()
                        if (r0 == 0) goto L60
                        X.0gaS r0 = r3
                        com.bytedance.keva.Keva r1 = r0.LLILLJJLI
                        if (r1 == 0) goto L60
                        java.lang.String r0 = "CollectionCacheLS"
                        r1.storeString(r0, r2)
                    L60:
                        X.C1C7U.LIZIZ(r3)
                        return
                    L64:
                        r0 = 0
                        goto L28
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C328320Cty.accept(java.lang.Object):void");
                }
            }).LJJIJIIJI(new C09JN() { // from class: X.00Nt
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$res$2");
                    C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$res$2");
                }
            }).LJJLIIIJLJLI(new C1088090eQB());
        } else {
            InterfaceC1171320gaQ interfaceC1171320gaQ2 = this.LL.LL;
            if (C0A17.LIZ()) {
                boolValueOf = Boolean.valueOf(z3);
            } else {
                boolValueOf = null;
            }
            c11nzLJJIJIIJIL = interfaceC1171320gaQ2.LIZ(j, 30, str2, "", str, null, z2, boolValueOf).LJJIJIIJIL(new C09JN() { // from class: X.01cn
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$res$3");
                    ((AbstractC2126608Uu) obj).checkValid();
                    C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$res$3");
                }
            });
        }
        C11JN c11jnLJJIJIIJIL = c11nzLJJIJIIJIL.LJJIJIIJIL(new AfS37S1000000_18(str2, 0)).LJJIJIIJIL(new AfS0S0120100_18(this, z3, z4, j, 1));
        if (string != null && string.length() != 0 && z && j == 0) {
            Gson gsonLIZ = C09C2.LIZ();
            Keva keva2 = this.LL.LLILLJJLI;
            if (keva2 != null) {
                string2 = keva2.getString("CollectionCache", "");
            }
            CollectionListResponse collectionListResponse = (CollectionListResponse) GsonProtectorUtils.fromJson(gsonLIZ, string2, CollectionListResponse.class);
            if (z3 && C0A17.LIZ()) {
                collectionListResponse.pinSection = ((CollectionListResponse) GsonProtectorUtils.fromJson(C09C2.LIZ(), string, CollectionListResponse.class)).pinSection;
            }
            c11jnLJJIJIIJIL.LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.00Nq
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$3");
                    C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$3");
                }
            }, new C09JN() { // from class: X.00Nr
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$4");
                    C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$4");
                }
            });
            return C11NZ.LJJJJZ(collectionListResponse).LJJIJIIJIL(new C09JN() { // from class: X.0O9O
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$5");
                    C1206780hVc.LIZJ("/tiktok/collection/item_archive/list/v1", "cache", (BaseResponse) obj);
                    C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$5");
                }
            }).LJJIJIIJIL(new AfS0S0120100_18(this, z3, z4, j, 0));
        }
        return c11jnLJJIJIIJIL.LJJIJIIJIL(new C09JN() { // from class: X.0O9P
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$1");
                C1206780hVc.LIZJ("/tiktok/collection/item_archive/list/v1", "net", (BaseResponse) obj);
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$1");
            }
        }).LJJIJIIJI(new C09JN() { // from class: X.0O9Q
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$2");
                C1206780hVc.LIZIZ("/tiktok/collection/item_archive/list/v1", (Throwable) obj);
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$2");
            }
        });
    }
}

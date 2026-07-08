package X;

import Y.AfS173S0100000_4;
import Y.AfS2S0100100_4;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.experiment.viewlist.ViewerListDiskCacheExpData;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.PureStoryViewerListFragment;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.SimpleStoryBulletPayload;
import com.ss.android.ugc.aweme.story.model.ContentReuseResponse;
import com.ss.android.ugc.aweme.story.model.FriendInteractionContentReuseApi;
import com.ss.android.ugc.aweme.story.model.StoryBulletListResponse;
import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Cxg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330620Cxg implements InterfaceC330760Cxu {
    public static final C330620Cxg LIZ = new C330620Cxg();

    @Override // X.InterfaceC330760Cxu
    public final void LJI() {
        C330530CxX c330530CxX = C330530CxX.LIZJ;
        C330500CxU.LIZ();
    }

    @Override // X.InterfaceC330760Cxu
    public final int LIZ(Aweme aweme) {
        C330770Cxv.LIZ.getClass();
        if (C330750Cxt.LIZ[C330770Cxv.LIZ(aweme).ordinal()] == 1) {
            return R.raw.icon_heart;
        }
        return R.raw.icon_play;
    }

    @Override // X.InterfaceC330760Cxu
    public final C330660Cxk LIZIZ(Uri uri) {
        List listLJJLIIIJILLIZJL;
        List listLJJLIIIJILLIZJL2;
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "cid");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "story_insert_user_id_list");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                listLJJLIIIJILLIZJL = null;
            } else {
                listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, new String[]{","}, 0, 6);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "story_insert_user_type_list");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, new String[]{","}, 0, 6);
            } else {
                listLJJLIIIJILLIZJL2 = null;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "highlight_cids");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null && (listLJJLIIIJILLIZJL == null || listLJJLIIIJILLIZJL2 == null)) {
                return null;
            }
            return LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, listLJJLIIIJILLIZJL, listLJJLIIIJILLIZJL2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // X.InterfaceC330760Cxu
    public final C330660Cxk LIZJ(Intent intent) {
        String stringExtra;
        String stringExtra2;
        List listLJJLIIIJILLIZJL;
        List listLJJLIIIJILLIZJL2;
        String stringExtra3;
        String stringExtra4;
        Serializable serializableExtra = intent.getSerializableExtra("Story_insert_user_wrapper");
        if (serializableExtra != null) {
            if (!(serializableExtra instanceof C330660Cxk)) {
                return null;
            }
            return (C330660Cxk) serializableExtra;
        }
        try {
            stringExtra = intent.getStringExtra("cid");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        try {
            stringExtra2 = intent.getStringExtra("story_insert_user_id_list");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            stringExtra2 = null;
        }
        if (stringExtra2 != null) {
            listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(stringExtra2, new String[]{","}, 0, 6);
        } else {
            listLJJLIIIJILLIZJL = null;
        }
        try {
            stringExtra4 = intent.getStringExtra("story_insert_user_type_list");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (stringExtra4 == null) {
            listLJJLIIIJILLIZJL2 = null;
        } else {
            listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(stringExtra4, new String[]{","}, 0, 6);
        }
        try {
            stringExtra3 = intent.getStringExtra("highlight_cids");
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            stringExtra3 = null;
        }
        if (stringExtra == null && stringExtra3 == null && (listLJJLIIIJILLIZJL == null || listLJJLIIIJILLIZJL2 == null)) {
            return null;
        }
        return LJIIJJI(stringExtra, stringExtra3, listLJJLIIIJILLIZJL, listLJJLIIIJILLIZJL2);
    }

    @Override // X.InterfaceC330760Cxu
    public final StoryBulletListResponse LJ(String str) {
        k kVarLJJIIZ;
        String strLJIL;
        k kVarLJJIIZ2;
        C330530CxX c330530CxX = C330530CxX.LIZJ;
        C330530CxX c330530CxX2 = C330530CxX.LIZJ;
        StoryBulletListResponse storyBulletListResponse = null;
        if (c330530CxX2 != null) {
            StoryBulletListResponse storyBulletListResponse2 = (StoryBulletListResponse) ((Map) c330530CxX2.LIZIZ.getValue()).get(str);
            if (storyBulletListResponse2 != null) {
                return storyBulletListResponse2;
            }
            ViewerListDiskCacheExpData viewerListDiskCacheExpData = C328170Ctj.LIZ;
            if (viewerListDiskCacheExpData.enabled) {
                try {
                    C01GW<Keva> c01gw = C330530CxX.LJIIIIZZ;
                    String string = c01gw.getValue().getString(str, "");
                    if (string != null && string.length() != 0) {
                        C1227904rF.LIZ.getClass();
                        Gson gsonLIZLLL = C1227904rF.LIZLLL();
                        n nVar = (n) gsonLIZLLL.LJII(string, n.class);
                        if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ("ts")) != null) {
                            if (System.currentTimeMillis() - kVarLJJIIZ.LJIIZILJ() > viewerListDiskCacheExpData.diskCacheTtlInMs) {
                                c01gw.getValue().erase(str);
                                return null;
                            }
                            k kVarLJJIIZ3 = nVar.LJJIIZ("clazz");
                            if (kVarLJJIIZ3 != null && (strLJIL = kVarLJJIIZ3.LJIL()) != null && (kVarLJJIIZ2 = nVar.LJJIIZ("data")) != null) {
                                if (viewerListDiskCacheExpData.simpleUserCacheEnabled && Intrinsics.LJFF(strLJIL, SimpleStoryBulletPayload.class.getName())) {
                                    SimpleStoryBulletPayload simpleStoryBulletPayload = (SimpleStoryBulletPayload) gsonLIZLLL.LIZJ(kVarLJJIIZ2, SimpleStoryBulletPayload.class);
                                    if (simpleStoryBulletPayload != null) {
                                        storyBulletListResponse = new StoryBulletListResponse(simpleStoryBulletPayload.total, simpleStoryBulletPayload.hasMore, simpleStoryBulletPayload.nextCursor, C1389550mGP.LIZIZ(simpleStoryBulletPayload.interactionUserList), simpleStoryBulletPayload.durationMs, StoryBulletListResponse.class.getName());
                                        ((Map) c330530CxX2.LIZIZ.getValue()).put(str, storyBulletListResponse);
                                        return storyBulletListResponse;
                                    }
                                } else {
                                    StoryBulletListResponse storyBulletListResponse3 = (StoryBulletListResponse) gsonLIZLLL.LIZJ(kVarLJJIIZ2, Class.forName(strLJIL));
                                    storyBulletListResponse = storyBulletListResponse3;
                                    if (storyBulletListResponse3 != null) {
                                        ((Map) c330530CxX2.LIZIZ.getValue()).put(str, storyBulletListResponse);
                                        return storyBulletListResponse;
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    String message = e.getMessage();
                    HashMap map = new HashMap();
                    map.put("author_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                    map.put("item_id", str);
                    Npth.reportBizException("ViewerListCache", e, message, map);
                    return null;
                }
            }
        }
        return storyBulletListResponse;
    }

    @Override // X.InterfaceC330760Cxu
    public final int LJII(Aweme aweme) {
        C330770Cxv.LIZ.getClass();
        return C330770Cxv.LIZIZ(aweme).LIZIZ;
    }

    @Override // X.InterfaceC330760Cxu
    public final boolean LJIIIIZZ(Aweme aweme) {
        VideoItemParams videoItemParams = new VideoItemParams();
        videoItemParams.setAweme(aweme);
        return C694880RNm.LIZIZ(videoItemParams);
    }

    @Override // X.InterfaceC330760Cxu
    public final InterfaceC330650Cxj LJIIIZ(C729040Sik c729040Sik) {
        PureStoryViewerListFragment.LLJI.getClass();
        PureStoryViewerListFragment pureStoryViewerListFragment = new PureStoryViewerListFragment();
        pureStoryViewerListFragment.LLIZ = c729040Sik;
        return pureStoryViewerListFragment;
    }

    @Override // X.InterfaceC330760Cxu
    public final InterfaceC330550CxZ LJIIJ(String str) {
        C330530CxX c330530CxX = C330530CxX.LIZJ;
        C330530CxX c330530CxX2 = C330530CxX.LIZJ;
        if (c330530CxX2 != null) {
            return c330530CxX2.LIZ(str);
        }
        return null;
    }

    @Override // X.InterfaceC330760Cxu
    public final Object LIZLLL(User user, InterfaceC1364105Vn<? super ContentReuseResponse> interfaceC1364105Vn) {
        FriendInteractionContentReuseApi.LIZ.getClass();
        return C330630Cxh.LIZIZ.getValue().getForUser(user.getUid(), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC330760Cxu
    public final C11NZ LJFF(Aweme aweme, long j) {
        String aid;
        String aid2;
        if (j == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            StoryApi storyApi = StoryApi.LIZIZ;
            if (aweme == null || (aid2 = aweme.getAid()) == null) {
                aid2 = "";
            }
            return storyApi.fetchStoryBulletList(aid2, j, 50, "null").LJJIJIIJIL(new AfS2S0100100_4(jCurrentTimeMillis, aweme, 4)).LJJIJIIJI(new AfS173S0100000_4(aweme, 23));
        }
        StoryApi storyApi2 = StoryApi.LIZIZ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        return storyApi2.fetchStoryBulletList(aid, j, 50, "null");
    }

    public static C330660Cxk LJIIJJI(String str, String str2, List list, List list2) {
        if (list != null && list2 != null) {
            ArrayList arrayList = new ArrayList();
            int iMin = Math.min(list.size(), list2.size());
            for (int i = 0; i < iMin; i++) {
                try {
                    C189200o6.m2constructorimpl(Boolean.valueOf(arrayList.add(new StoryInsertUser(CastLongProtector.parseLong((String) list.get(i)), CastIntegerProtector.parseInt((String) list2.get(i))))));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            return new C330660Cxk(arrayList, str, str2);
        }
        return new C330660Cxk(C13BV.INSTANCE, str, str2);
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteLogger;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.commercialize.promote.model.BottomButton;
import com.ss.android.ugc.aweme.commercialize.promote.ui.PostBottomButtonConfigProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.StandardButtonContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentKey;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707680RpO implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final /* synthetic */ PostBottomButtonConfigProvider LL;

    public C707680RpO(PostBottomButtonConfigProvider postBottomButtonConfigProvider) {
        this.LL = postBottomButtonConfigProvider;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        final Aweme aweme;
        StandardComponentStruct standardComponentStruct;
        String str;
        String uid;
        final String str2;
        C1891540zK4 c1891540zK4LJJIJ;
        User currentUser;
        StandardButtonContainerStruct standardButtonContainerStruct;
        List<StandardComponentStruct> list;
        StandardComponentStruct next;
        String str3;
        VideoItemParams videoItemParams2 = videoItemParams;
        PostBottomButtonConfigProvider postBottomButtonConfigProvider = this.LL;
        postBottomButtonConfigProvider.getClass();
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
            final String str4 = videoItemParams2.mEventType;
            StandardComponentInfo standardComponentInfo = aweme.getStandardComponentInfo();
            if (standardComponentInfo != null && (standardButtonContainerStruct = standardComponentInfo.buttonContainer) != null && (list = standardButtonContainerStruct.buttons) != null) {
                Iterator<StandardComponentStruct> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        StandardComponentKey standardComponentKey = next.key;
                        if (standardComponentKey != null) {
                            str3 = standardComponentKey.componentKey;
                        } else {
                            str3 = null;
                        }
                        if (Intrinsics.LJFF(str3, "bottom_button_promote_post_button")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                standardComponentStruct = next;
            } else {
                standardComponentStruct = null;
            }
            Gson gson = new Gson();
            if (standardComponentStruct != null) {
                str = standardComponentStruct.customizedInfo;
            } else {
                str = null;
            }
            final BottomButton bottomButton = (BottomButton) GsonProtectorUtils.fromJson(gson, str, BottomButton.class);
            IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
                uid = currentUser.getUid();
            } else {
                uid = null;
            }
            if (Intrinsics.LJFF(uid, AwemeExtKt.getAuthorUid(aweme))) {
                str2 = "myself";
            } else {
                str2 = "others";
            }
            ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null);
            if (iCommercePromoteService != null) {
                c1891540zK4LJJIJ = iCommercePromoteService.LJJIJ(new InterfaceC1891550zK5() { // from class: X.0RpP
                    @Override // X.InterfaceC1891550zK5
                    public final String LIZ() {
                        return "bottom_button";
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final String getEnterFrom() {
                        return "video";
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final Map<String, Object> getExtra() {
                        return null;
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final String getItemId() {
                        return aweme.getAid();
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final String getSchema() {
                        BottomButton bottomButton2 = bottomButton;
                        if (bottomButton2 != null) {
                            return bottomButton2.getSchema();
                        }
                        return null;
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final Context getContext() {
                        Activity activityLIZIZ;
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                            return activityLIZIZ;
                        }
                        C844470XAv.LIZ.getClass();
                        return C844470XAv.LIZ();
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final String LIZIZ() {
                        return str2;
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final Aweme getAweme() {
                        return aweme;
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final String getPageType() {
                        return str4;
                    }
                });
            } else {
                c1891540zK4LJJIJ = null;
            }
            postBottomButtonConfigProvider.LL = c1891540zK4LJJIJ;
            if (c1891540zK4LJJIJ != null) {
                c1891540zK4LJJIJ.preload();
            }
            ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
            if (iCommercePromoteLogger != null) {
                iCommercePromoteLogger.LJIIJJI("video", aweme, str2, "bottom_button", str4, null, null, null);
            }
        }
        return new C1387205bq(null);
    }
}

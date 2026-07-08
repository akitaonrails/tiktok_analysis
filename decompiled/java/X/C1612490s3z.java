package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.model.PaidCollectionListResponse;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0s3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612490s3z extends C1611660s2e {
    public static final C1612490s3z LJI = new C1612490s3z();

    public static Unit LJJJJLL(PaidCollectionListResponse paidCollectionListResponse) {
        int size;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (paidCollectionListResponse != null) {
            List<CollectionDetailModel> list = paidCollectionListResponse.collectionList;
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            c2344009Gk.LIZJ(size, "fav_collection_count");
            LJI.getClass();
            C1612480s3y.LJI(c2344009Gk, paidCollectionListResponse);
        }
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("click_collections_favorite_tab", c2344009Gk.LIZ);
            return Unit.LIZ;
        }
        return null;
    }

    public static void LJJJJJ(C2344009Gk c2344009Gk, C1612560s46 c1612560s46) {
        String str;
        String strLJIJJ;
        List<String> list;
        if (c1612560s46 == null || (str = c1612560s46.panelType) == null) {
            str = "half";
        }
        c2344009Gk.LJFF("panel_type", str);
        if (c1612560s46 != null) {
            strLJIJJ = C1612480s3y.LJIJJ(c1612560s46.ifUsePopup);
        } else {
            strLJIJJ = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("if_use_popup", strLJIJJ);
        if (c1612560s46 != null) {
            list = c1612560s46.subscriptionType;
        } else {
            list = null;
        }
        c2344009Gk.LJ(list, "subscription_type");
    }

    public static void LJJJLIIL(long j, String str, SeriesCategory seriesCategory) {
        Integer numValueOf;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "loading_duration");
        c2344009Gk.LJFF("collection_id", str);
        if (seriesCategory != null) {
            numValueOf = Integer.valueOf(seriesCategory.ordinal());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "series_category");
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("purchase_to_view_unlocked_content", c2344009Gk.LIZ);
        }
    }

    public static void LJJJJZI(long j, boolean z, String str, String str2, String str3, boolean z2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        LJI.getClass();
        c2344009Gk.LJFF("has_confirmed_purchase", C1612480s3y.LJIJJ(z));
        C1612480s3y.LJIIL(c2344009Gk, str, false);
        if (str2 != null) {
            C1612480s3y.LJFF(c2344009Gk, str2);
        }
        C1612480s3y.LJIILLIIL(c2344009Gk, z2);
        c2344009Gk.LJFF("error_code", str3);
        c2344009Gk.LIZLLL(j, "loading_duration");
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("purchase_confirmation_polling", c2344009Gk.LIZ);
        }
    }

    public static void LJJJJLI(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("collection_id", str2);
        c2344009Gk.LJFF("series_enter_entrance", str3);
        c2344009Gk.LJFF("action_type", str4);
        c2344009Gk.LJFF("show_type", str5);
        c2344009Gk.LJFF("business_type", str6);
        if (str7 != null) {
            c2344009Gk.LJFF("payment_type", str7);
        }
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("collection_unlock_notice", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LJJJLL(CollectionDetailModel collectionDetailModel, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, Integer num, Boolean bool5, String str3, String str4, SeriesCategory seriesCategory, C1612600s4A c1612600s4A, Boolean bool6, Boolean bool7, String str5, C1612570s47 c1612570s47, String str6, String str7, C1612560s46 c1612560s46, DramaExtraTrackingParams dramaExtraTrackingParams) {
        String strLJIJJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            LJI.getClass();
            C1612480s3y.LJIILL(c2344009Gk, zBooleanValue);
        }
        C1612490s3z c1612490s3z = LJI;
        c1612490s3z.getClass();
        C1612480s3y.LJIIL(c2344009Gk, str, false);
        c2344009Gk.LJIIIIZZ("source_way", str2);
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "index");
        }
        if (bool5 != null) {
            c2344009Gk.LIZJ(bool5.booleanValue() ? 1 : 0, "is_auto_display");
        }
        c2344009Gk.LJFF("if_offer_bundle_discount", str4);
        if (str3 != null) {
            c2344009Gk.LJIIIIZZ("group_id", str3);
        }
        boolean zBooleanValue2 = false;
        if (collectionDetailModel != null) {
            C1612480s3y.LJIIJ(c2344009Gk, collectionDetailModel);
            C1611660s2e.LJJI(c2344009Gk, collectionDetailModel);
            C1612480s3y.LJIIJJI(c2344009Gk, collectionDetailModel, false);
            c1612490s3z.LJJIIJZLJL(c2344009Gk, bool6, String.valueOf(collectionDetailModel.collectionId));
        }
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        }
        c2344009Gk.LJFF("is_from_bottom_banner", C1612480s3y.LJIJJ(zBooleanValue2));
        String strLJIJJ2 = null;
        if (bool3 != null) {
            strLJIJJ = C1612480s3y.LJIJJ(bool3.booleanValue());
        } else {
            strLJIJJ = null;
        }
        c2344009Gk.LJFF("is_from_drama_component", strLJIJJ);
        if (bool4 != null) {
            strLJIJJ2 = C1612480s3y.LJIJJ(bool4.booleanValue());
        }
        c2344009Gk.LJFF("is_from_sdp", strLJIJJ2);
        C1612480s3y.LJIJI(c2344009Gk, seriesCategory);
        C1612480s3y.LJIIZILJ(c2344009Gk, c1612600s4A);
        c1612490s3z.LJJIII(c2344009Gk, bool7);
        c1612490s3z.LJJIFFI(c2344009Gk, dramaExtraTrackingParams);
        c1612490s3z.LJJIIZ(c2344009Gk, str5);
        C1612480s3y.LJIJ(c2344009Gk, c1612570s47);
        c2344009Gk.LJFF("panel_type", str7);
        c2344009Gk.LJFF("series_enter_entrance", str6);
        LJJJJJ(c2344009Gk, c1612560s46);
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("show_collection_episode_purchase_window", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static Unit LJJJZ(SeriesCategory seriesCategory, DramaExtraTrackingParams dramaExtraTrackingParams, C1612600s4A c1612600s4A, C1612570s47 c1612570s47, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Float f, Integer num, Integer num2, Integer num3, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6) {
        boolean zBooleanValue;
        String strLJIJJ;
        String strLJIJJ2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str3);
        c2344009Gk.LJFF("collection_user_id", str);
        c2344009Gk.LJ(l, "collection_id");
        c2344009Gk.LJFF("collection_price", str2);
        c2344009Gk.LJ(num, "collection_video_cnt");
        c2344009Gk.LJ(f, "collection_rating");
        c2344009Gk.LJ(l2, "collection_duration");
        c2344009Gk.LJ(bool, "has_intro_video");
        C1612490s3z c1612490s3z = LJI;
        boolean zBooleanValue2 = false;
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c1612490s3z.getClass();
        c2344009Gk.LJFF("is_from_anchor", C1612480s3y.LJIJJ(zBooleanValue));
        if (bool3 != null) {
            zBooleanValue2 = bool3.booleanValue();
        }
        c2344009Gk.LJFF("is_from_bottom_banner", C1612480s3y.LJIJJ(zBooleanValue2));
        if (bool4 != null) {
            strLJIJJ = C1612480s3y.LJIJJ(bool4.booleanValue());
        } else {
            strLJIJJ = null;
        }
        c2344009Gk.LJFF("is_from_drama_component", strLJIJJ);
        if (bool5 != null) {
            strLJIJJ2 = C1612480s3y.LJIJJ(bool5.booleanValue());
        } else {
            strLJIJJ2 = null;
        }
        c2344009Gk.LJFF("is_from_sdp", strLJIJJ2);
        c2344009Gk.LJ(num2, "anchor_number");
        c2344009Gk.LJ(num3, "multi_anchor");
        c2344009Gk.LJFF("source_way", str4);
        if (bool6 != null) {
            c2344009Gk.LIZJ(bool6.booleanValue() ? 1 : 0, "is_auto_display");
        }
        C1612480s3y.LJIJI(c2344009Gk, seriesCategory);
        C1612480s3y.LJIIZILJ(c2344009Gk, c1612600s4A);
        c1612490s3z.LJJIIJZLJL(c2344009Gk, bool7, String.valueOf(l));
        c1612490s3z.LJJIII(c2344009Gk, bool8);
        c1612490s3z.LJJIFFI(c2344009Gk, dramaExtraTrackingParams);
        c1612490s3z.LJJIIZ(c2344009Gk, str5);
        C1612480s3y.LJIJ(c2344009Gk, c1612570s47);
        c2344009Gk.LJFF("series_enter_entrance", str6);
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ == null) {
            return null;
        }
        miniDramaETInjectServiceLIZ.onEventV3("show_order_summary", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LJJJJJL(CollectionDetailModel collectionDetailModel, Boolean bool, String str, Integer num, String str2, String str3, Boolean bool2, Integer num2, String str4, Boolean bool3, String str5, String str6, String str7, String str8, String str9, Boolean bool4, Boolean bool5, Boolean bool6, C1612600s4A c1612600s4A, Boolean bool7, Boolean bool8, String str10, String str11, C1612560s46 c1612560s46, DramaExtraTrackingParams dramaExtraTrackingParams, String str12, String str13) {
        String strLJIJJ;
        String strLJIJJ2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            LJI.getClass();
            C1612480s3y.LJIILL(c2344009Gk, zBooleanValue);
        }
        C1612490s3z c1612490s3z = LJI;
        c1612490s3z.getClass();
        C1612480s3y.LJIIL(c2344009Gk, str, false);
        c2344009Gk.LJIIIIZZ("source_way", str3);
        if (num2 != null) {
            c2344009Gk.LIZJ(num2.intValue(), "index");
        }
        if (bool2 != null) {
            c2344009Gk.LIZJ(bool2.booleanValue() ? 1 : 0, "is_auto_display");
        }
        if (str4 != null) {
            c2344009Gk.LJIIIIZZ("group_id", str4);
        }
        if (str9 != null) {
            c2344009Gk.LJIIIIZZ("video_id", str9);
        }
        if (collectionDetailModel != null) {
            C1612480s3y.LJIIJ(c2344009Gk, collectionDetailModel);
            C1611660s2e.LJJI(c2344009Gk, collectionDetailModel);
            C1612480s3y.LJIIJJI(c2344009Gk, collectionDetailModel, false);
            C1612480s3y.LJIJI(c2344009Gk, collectionDetailModel.category);
            c1612490s3z.LJJIIJZLJL(c2344009Gk, bool7, String.valueOf(collectionDetailModel.collectionId));
        }
        c2344009Gk.LJFF("price_to_purchase", str2);
        c2344009Gk.LJ(num, "video_count_to_purchase");
        if (bool3 != null) {
            c2344009Gk.LIZJ(bool3.booleanValue() ? 1 : 0, "is_purchase_full_series");
        }
        String strLJIJJ3 = null;
        if (bool4 != null) {
            strLJIJJ = C1612480s3y.LJIJJ(bool4.booleanValue());
        } else {
            strLJIJJ = null;
        }
        c2344009Gk.LJFF("is_from_sdp", strLJIJJ);
        if (bool5 != null) {
            strLJIJJ2 = C1612480s3y.LJIJJ(bool5.booleanValue());
        } else {
            strLJIJJ2 = null;
        }
        c2344009Gk.LJFF("is_from_bottom_banner", strLJIJJ2);
        if (bool6 != null) {
            strLJIJJ3 = C1612480s3y.LJIJJ(bool6.booleanValue());
        }
        c2344009Gk.LJFF("is_from_drama_component", strLJIJJ3);
        c2344009Gk.LJFF("if_offer_bundle_discount", str5);
        c2344009Gk.LJFF("if_click_bundle_discount", str6);
        c2344009Gk.LJFF("bundle_title", str7);
        c2344009Gk.LJFF("bundle_price", str8);
        if (str12 != null) {
            c2344009Gk.LJFF("bundle_price_no_discount", str12);
        }
        if (str13 != null) {
            c2344009Gk.LJFF("promo_type", str13);
        }
        C1612480s3y.LJIIZILJ(c2344009Gk, c1612600s4A);
        c1612490s3z.LJJIII(c2344009Gk, bool8);
        c1612490s3z.LJJIFFI(c2344009Gk, dramaExtraTrackingParams);
        c1612490s3z.LJJIIZ(c2344009Gk, str10);
        c2344009Gk.LJFF("series_enter_entrance", str11);
        LJJJJJ(c2344009Gk, c1612560s46);
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("click_collection_episode_purchase", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:561:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJJZ(X.C1612490s3z r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.Boolean r59, java.lang.Boolean r60, X.C1155930gBb r61, java.lang.Boolean r62, java.lang.String r63, java.lang.Long r64, java.lang.String r65, java.lang.Integer r66, java.lang.Integer r67, java.lang.Boolean r68, java.lang.Integer r69, java.lang.String r70, com.ss.android.ugc.aweme.model.CollectionDetailModel r71, com.ss.android.ugc.aweme.model.PaidCollectionListResponse r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.Integer r76, java.lang.Integer r77, java.lang.Integer r78, boolean r79, java.lang.String r80, java.lang.Integer r81, java.lang.Boolean r82, java.lang.Boolean r83, java.lang.Boolean r84, boolean r85, com.ss.android.ugc.aweme.feed.model.Aweme r86, java.lang.String r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, java.lang.String r91, com.ss.android.ugc.aweme.feed.model.SeriesCategory r92, java.lang.Integer r93, java.lang.Boolean r94, X.C1612600s4A r95, java.lang.Boolean r96, java.lang.Boolean r97, java.lang.Boolean r98, java.lang.String r99, X.C1612570s47 r100, java.lang.String r101, X.C1612560s46 r102, com.ss.android.ugc.aweme.model.DramaExtraTrackingParams r103, java.lang.Integer r104, java.lang.String r105, java.lang.Integer r106, java.lang.String r107, java.lang.String r108, java.lang.String r109, java.lang.Integer r110, int r111, int r112) {
        /*
            Method dump skipped, instruction units count: 2502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1612490s3z.LJJJJZ(X.0s3z, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, X.0gBb, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.String, com.ss.android.ugc.aweme.model.CollectionDetailModel, com.ss.android.ugc.aweme.model.PaidCollectionListResponse, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, boolean, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.SeriesCategory, java.lang.Integer, java.lang.Boolean, X.0s4A, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, X.0s47, java.lang.String, X.0s46, com.ss.android.ugc.aweme.model.DramaExtraTrackingParams, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, int):void");
    }
}

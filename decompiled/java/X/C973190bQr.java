package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkMicGiftGalleryDisplayText;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0bQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973190bQr {
    public static final void LIZJ(Map<String, ? extends C1294320jmo> map, Bitmap bitmap, String str) {
        Integer numValueOf;
        try {
            C1294320jmo c1294320jmo = map.get(str);
            if (c1294320jmo != null && bitmap != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("image, width ");
                sbLIZ.append(c1294320jmo.LIZ);
                sbLIZ.append(", height ");
                sbLIZ.append(c1294320jmo.LIZIZ);
                sbLIZ.append(". getLeagueInfoBitmap ");
                sbLIZ.append(bitmap.getWidth());
                sbLIZ.append(", ");
                sbLIZ.append(bitmap.getHeight());
                C20441214yg.LIZIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ));
                c1294320jmo.LJFF = C978440bZK.LJIIJJI(c1294320jmo.LIZ, c1294320jmo.LIZIZ, bitmap);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("new image, width ");
                Bitmap bitmap2 = c1294320jmo.LJFF;
                Integer numValueOf2 = null;
                if (bitmap2 != null) {
                    numValueOf = Integer.valueOf(bitmap2.getWidth());
                } else {
                    numValueOf = null;
                }
                sbLIZ2.append(numValueOf);
                sbLIZ2.append(", height ");
                Bitmap bitmap3 = c1294320jmo.LJFF;
                if (bitmap3 != null) {
                    numValueOf2 = Integer.valueOf(bitmap3.getHeight());
                }
                sbLIZ2.append(numValueOf2);
                C20441214yg.LIZIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ2));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Exception, ");
            sbLIZ3.append(e);
            C20441214yg.LIZIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public static final void LIZ(final int i, final Bitmap bitmap, C954460awe c954460awe, final Map<String, ? extends C1294320jmo> map, final List<String> list) {
        ImageModel imageModel;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start try to replace avatar, index = ");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ));
            C754570Tip c754570Tip = c954460awe.LJIJJ;
            if (c754570Tip != null && (imageModel = c754570Tip.LIZJ) != null) {
                IHostFrescoHelper iHostFrescoHelper = (IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class);
                if (iHostFrescoHelper != null) {
                    iHostFrescoHelper.xW1(imageModel, new InterfaceC177000m8() { // from class: X.0bQq
                        @Override // X.InterfaceC177000m8
                        public final void LIZ(Bitmap bitmap2) {
                            Bitmap bitmap3;
                            boolean z;
                            Boolean boolValueOf;
                            if (bitmap2 == null) {
                                bitmap3 = bitmap;
                            } else {
                                bitmap3 = bitmap2;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onNewResultImpl success, back bitmap is null: ");
                            if (bitmap2 == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            sbLIZ2.append(z);
                            sbLIZ2.append(" bitmap is recyle: ");
                            if (bitmap2 != null) {
                                boolValueOf = Boolean.valueOf(bitmap2.isRecycled());
                            } else {
                                boolValueOf = null;
                            }
                            sbLIZ2.append(boolValueOf);
                            C20441214yg.LJIIIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ2));
                            C973190bQr.LIZIZ(i, bitmap3, map, list, "success");
                        }
                    });
                    return;
                }
                return;
            }
            C20441214yg.LJIIIZ("MatchLottieExtension", "user imageModel = null");
            LIZIZ(i, bitmap, map, list, "avatar lose");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("imagePathObservable, replace avatar exception,msg = ");
            sbLIZ2.append(e.getMessage());
            C20441214yg.LJIIIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ2));
            LIZIZ(i, bitmap, map, list, "exception");
        }
    }

    public static final void LIZIZ(int i, Bitmap bitmap, Map<String, ? extends C1294320jmo> map, List<String> list, String str) {
        String str2;
        boolean z;
        Bitmap bitmapLIZ;
        if (list.size() > i) {
            str2 = (String) ListProtector.get(list, i);
        } else {
            str2 = "";
        }
        C1294320jmo c1294320jmo = map.get(str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", imageFile is null: ");
        if (c1294320jmo == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" imageFilePath ");
        sbLIZ.append(str2);
        sbLIZ.append(',');
        C20441214yg.LJIIIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ));
        if (c1294320jmo != null && bitmap != null && (bitmapLIZ = C2476909nD.LIZ(bitmap)) != null) {
            Bitmap bitmapLJIIJJI = C978440bZK.LJIIJJI(c1294320jmo.LIZ, c1294320jmo.LIZIZ, bitmapLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("bitmap height = ");
            sbLIZ2.append(bitmapLIZ.getHeight());
            sbLIZ2.append(", width = ");
            sbLIZ2.append(bitmapLIZ.getWidth());
            C20441214yg.LJIIIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("imageFile height = ");
            sbLIZ3.append(c1294320jmo.LIZIZ);
            sbLIZ3.append(", width = ");
            sbLIZ3.append(c1294320jmo.LIZ);
            C20441214yg.LJIIIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ3));
            c1294320jmo.LJFF = bitmapLJIIJJI;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("imageFile , ");
            sbLIZ4.append(c1294320jmo);
            C20441214yg.LIZIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ4));
            if (c1294320jmo.LJFF == null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(str);
                sbLIZ5.append(" replace error");
                C20441214yg.LJIIIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ5));
            }
        }
    }

    public static final void LIZLLL(final GiftGalleryBadgeInfo giftGalleryBadgeInfo, final Context context, final LinkedList linkedList, final Map map, final List list, final int i, final EnumC973150bQn enumC973150bQn) {
        ImageModel imageModel;
        IHostFrescoHelper iHostFrescoHelper = (IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class);
        if (iHostFrescoHelper != null) {
            GiftGalleryBadgeSection giftGalleryBadgeSection = giftGalleryBadgeInfo.leagueInfo;
            if (giftGalleryBadgeSection != null) {
                imageModel = giftGalleryBadgeSection.icon;
            } else {
                imageModel = null;
            }
            iHostFrescoHelper.xW1(imageModel, new InterfaceC177000m8() { // from class: X.0bQp
                @Override // X.InterfaceC177000m8
                public final void LIZ(Bitmap bitmap) {
                    Boolean boolValueOf;
                    float f;
                    float f2;
                    LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("League onNewResultImpl success, back bitmap: ");
                    sbLIZ.append(bitmap);
                    sbLIZ.append(" bitmap is recyle: ");
                    String str = null;
                    if (bitmap != null) {
                        boolValueOf = Boolean.valueOf(bitmap.isRecycled());
                    } else {
                        boolValueOf = null;
                    }
                    sbLIZ.append(boolValueOf);
                    C20441214yg.LJIIIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ));
                    Context context2 = context;
                    if (context2 != null) {
                        EnumC973150bQn enumC973150bQn2 = enumC973150bQn;
                        GiftGalleryBadgeInfo giftGalleryBadgeInfo2 = giftGalleryBadgeInfo;
                        LinkedList<Bitmap> linkedList2 = linkedList;
                        Map<String, C1294320jmo> map2 = map;
                        List<String> list2 = list;
                        int i2 = i;
                        C973130bQl c973130bQl = new C973130bQl(context2, null, enumC973150bQn2);
                        c973130bQl.LIZIZ(giftGalleryBadgeInfo2, false);
                        View viewFindViewById = c973130bQl.findViewById(R.id.lm7);
                        if (viewFindViewById != null) {
                            viewFindViewById.setBackground(new C443530HaJ(context2.getResources(), bitmap));
                        }
                        EnumC973150bQn enumC973150bQn3 = EnumC973150bQn.DEFAULT;
                        if (enumC973150bQn2 == enumC973150bQn3) {
                            f = 36.0f;
                        } else {
                            f = 27.0f;
                        }
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) C497740JfY.LIZIZ(f), 1073741824);
                        if (enumC973150bQn2 == enumC973150bQn3) {
                            f2 = 16.0f;
                        } else {
                            f2 = 14.0f;
                        }
                        c973130bQl.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) C497740JfY.LIZIZ(f2), 1073741824));
                        c973130bQl.layout(0, 0, c973130bQl.getMeasuredWidth(), c973130bQl.getMeasuredHeight());
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("view, width ");
                        sbLIZ2.append(c973130bQl.getWidth());
                        sbLIZ2.append(", height ");
                        sbLIZ2.append(c973130bQl.getHeight());
                        C20441214yg.LIZIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ2));
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c973130bQl.getWidth(), c973130bQl.getHeight(), Bitmap.Config.ARGB_8888);
                        C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), c973130bQl);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("RankBadgeView ");
                        sbLIZ3.append(c973130bQl.hashCode());
                        sbLIZ3.append(", leagueInfo: ");
                        GiftGalleryBadgeSection giftGalleryBadgeSection2 = giftGalleryBadgeInfo2.leagueInfo;
                        if (giftGalleryBadgeSection2 != null && (linkMicGiftGalleryDisplayText = giftGalleryBadgeSection2.displayText) != null) {
                            str = linkMicGiftGalleryDisplayText.content;
                        }
                        sbLIZ3.append(str);
                        C20441214yg.LIZIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ3));
                        linkedList2.add(bitmapCreateBitmap);
                        try {
                            C973190bQr.LIZJ(map2, bitmapCreateBitmap, list2.get(i2));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("replaceLeagueBitmap Exception, ");
                            sbLIZ4.append(e);
                            C20441214yg.LIZIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    }
                }
            });
        }
    }
}

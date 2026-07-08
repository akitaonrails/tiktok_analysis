package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vxd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814710Vxd {
    public static Bitmap LIZIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - iMin) / 2, (bitmap.getHeight() - iMin) / 2, iMin, iMin);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float f = iMin / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap2;
    }

    public static String LIZLLL(int i) {
        String strValueOf = String.valueOf(i);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 14) {
                                if (i != 15) {
                                    if (i != 21) {
                                        if (i != 30) {
                                            if (i != 10000) {
                                                if (i != 10001) {
                                                    switch (i) {
                                                        case 7:
                                                            return "HW";
                                                        case 8:
                                                            return "MZ";
                                                        case BdTuring.TYPE_ECAF /* 9 */:
                                                            return "ALIYUN";
                                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                            return "OPPO";
                                                        default:
                                                            return strValueOf;
                                                    }
                                                }
                                                return "CLIENT_NON_LOGIN";
                                            }
                                            return "CLIENT";
                                        }
                                        return "OPPO_SYSTEM";
                                    }
                                    return "BYTESYNC";
                                }
                                return "FRONTIER";
                            }
                            return "ADM";
                        }
                        return "GCM";
                    }
                    return "GETUI";
                }
                return "IXINTUI";
            }
            return "MYSELF";
        }
        return "MI";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(X.C814730Vxf r4) {
        /*
            X.0Vxq r0 = r4.extra
            java.lang.String r1 = r0.notificationChannelId
            java.lang.String r2 = r0.soundUrl
            X.0VwD r0 = X.C810810VrL.LIZ
            java.lang.String r0 = "_associated_"
            int r0 = r1.indexOf(r0)
            if (r0 >= 0) goto L14
            int r0 = r1.length()
        L14:
            r4 = 0
            java.lang.String r1 = r1.substring(r4, r0)
            java.lang.String r0 = "im_push"
            boolean r3 = java.util.Objects.equals(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r2 = r0 ^ 1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L46
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r1 = X.C844470XAv.LIZ()
            if (r1 == 0) goto L4f
            java.lang.String r0 = "notification"
            java.lang.Object r1 = X.C786410Ut5.H2(r1, r0)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            java.lang.String r0 = "im_push_custom_tone"
            android.app.NotificationChannel r0 = r1.getNotificationChannel(r0)
            if (r0 == 0) goto L4f
        L46:
            r0 = 1
        L47:
            if (r3 == 0) goto L4e
            if (r2 == 0) goto L4e
            if (r0 == 0) goto L4e
            r4 = 1
        L4e:
            return r4
        L4f:
            r0 = 0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C814710Vxd.LJFF(X.0Vxf):boolean");
    }

    public static boolean LJ(Context context, int i, Intent intent) {
        if (i == 0) {
            try {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2dv+7a5PH3nxumRhhblrKK/KhkOeHDGmEK1LScg==", null));
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }

    public static boolean LJI(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject.isNull(str)) {
            return z;
        }
        int iOptInt = jSONObject.optInt(str, -1);
        if (iOptInt >= 1) {
            return true;
        }
        if (iOptInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, z);
    }

    public static void LIZ(Context context, C814730Vxf c814730Vxf, C813610Vvr c813610Vvr, String str) {
        boolean z;
        PendingIntent activity;
        int size = c814730Vxf.extra.actionList.size();
        for (int i = 0; i < size; i++) {
            Uri uri = UriProtector.parse(((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[2]);
            Intent intent = new Intent();
            intent.putExtra("action_id", ((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[0]);
            intent.putExtra("action_title", ((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[1]);
            intent.putExtra("from_notification", true);
            intent.putExtra("msg_from", 1);
            intent.putExtra("is_from_button", true);
            intent.putExtra("need_clear_notification_push_id", C814730Vxf.getShortMsgID(c814730Vxf.id));
            intent.putExtra("cancel_TAG", "app_notify_ame");
            if (!"snssdk1180://push/dislike".equals(uri.toString()) && !"snssdk1233://push/dislike".equals(uri.toString()) && !"snssdk473824://push/dislike".equals(uri.toString()) && !"snssdk259://push/dislike".equals(uri.toString())) {
                z = false;
            } else {
                z = true;
            }
            boolean zEquals = "1".equals(((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[3]);
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AwemePushUtils.addActionButtons[Dislike](");
                sbLIZ.append(((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[0]);
                sbLIZ.append(", ");
                sbLIZ.append(((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[1]);
                sbLIZ.append(", ");
                sbLIZ.append(((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[2]);
                sbLIZ.append(")");
                C2188811AlT.LIZIZ(sbLIZ);
                if (!TextUtils.isEmpty(c814730Vxf.openUrl)) {
                    intent.putExtra("url_string", c814730Vxf.openUrl);
                }
                if (!TextUtils.isEmpty(c814730Vxf.extra.authorId)) {
                    intent.putExtra("author_id", c814730Vxf.extra.authorId);
                }
                if (!TextUtils.isEmpty(c814730Vxf.extra.userId)) {
                    intent.putExtra("user_id", c814730Vxf.extra.userId);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(context.getPackageName());
                sbLIZ2.append(".action.PUSH_DISLIKE");
                intent.setAction(C2188811AlT.LIZIZ(sbLIZ2));
                intent.setPackage(context.getPackageName());
                activity = PendingIntent.getBroadcast(context, C814730Vxf.getShortMsgID(c814730Vxf.id), intent, 201326592);
            } else if (zEquals) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("AwemePushUtils.addActionButtons[DirectlyReply](");
                sbLIZ3.append(((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[0]);
                sbLIZ3.append(", ");
                sbLIZ3.append(((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[1]);
                sbLIZ3.append(", ");
                sbLIZ3.append(((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[2]);
                sbLIZ3.append(")");
                C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(context.getPackageName());
                sbLIZ4.append(".action.PUSH_DIRECT_REPLY");
                intent.setAction(C2188811AlT.LIZIZ(sbLIZ4));
                intent.setPackage(context.getPackageName());
                String str2 = ((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[2];
                if (TextUtils.isEmpty(str2)) {
                    str2 = c814730Vxf.openUrl;
                }
                intent.putExtra("content_str", str2);
                if (!TextUtils.isEmpty(str)) {
                    intent.putExtra("push_groups_id", str);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    activity = PendingIntent.getBroadcast(context, C814730Vxf.getShortMsgID(c814730Vxf.id), intent, 167772160);
                } else {
                    activity = PendingIntent.getBroadcast(context, C814730Vxf.getShortMsgID(c814730Vxf.id), intent, 134217728);
                }
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("AwemePushUtils.addActionButtons(");
                sbLIZ5.append(((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[0]);
                sbLIZ5.append(", ");
                sbLIZ5.append(((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[1]);
                sbLIZ5.append(", ");
                sbLIZ5.append(((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[2]);
                sbLIZ5.append(")");
                C2188811AlT.LIZIZ(sbLIZ5);
                intent.setAction("android.intent.action.VIEW");
                intent.setData(uri);
                activity = PendingIntent.getActivity(context, C814730Vxf.getShortMsgID(c814730Vxf.id), intent, 201326592);
            }
            C813550Vvl c813550Vvl = new C813550Vvl(R.mipmap.c, ((String[]) ListProtector.get(c814730Vxf.extra.actionList, i))[1], activity);
            if (zEquals) {
                C813920VwM c813920VwM = new C813920VwM();
                C813560Vvm c813560Vvm = new C813560Vvm(c813920VwM.LIZ, c813920VwM.LIZLLL, c813920VwM.LJ, c813920VwM.LIZJ, c813920VwM.LIZIZ);
                if (c813550Vvl.LJFF == null) {
                    c813550Vvl.LJFF = new ArrayList<>();
                }
                c813550Vvl.LJFF.add(c813560Vvm);
            }
            c813610Vvr.LIZIZ.add(c813550Vvl.LIZ());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:(2:178|(1:180)(2:181|(2:183|(1:185))(2:186|(2:188|(3:190|(3:192|(1:411)(2:195|409)|196)|408))(2:197|(3:199|(1:201)|202)(48:203|(2:211|212)(2:205|(5:207|(1:209)|210|211|212)(18:213|(2:215|(5:217|(1:219)(1:327)|(3:221|(1:223)(1:325)|(1:225))(1:326)|226|(2:228|(1:230)(3:316|(1:318)(1:320)|319))(2:321|(1:323)(1:324)))(1:328))|231|(1:233)(1:315)|234|(1:236)|237|(1:239)(1:314)|240|(1:312)(1:313)|243|(1:245)|246|(5:248|(1:308)(1:252)|253|(1:255)(1:307)|256)(1:(1:310))|257|(10:259|(1:261)|262|(1:264)(1:290)|265|(1:288)(1:289)|(1:269)(5:275|(1:285)(1:279)|280|(1:282)(1:284)|283)|270|(1:272)|273)(2:291|(5:295|(1:297)|298|(1:300)(3:302|(1:304)(1:306)|305)|301))|274|212))|87|(1:89)(1:169)|90|(1:168)(1:94)|(1:97)|98|(1:100)|101|(1:103)|104|(2:106|(2:108|(1:110))(2:165|(1:167)))|111|(2:113|(1:115)(3:157|(1:159)|160))(3:161|(1:163)|164)|116|(2:118|(1:120)(3:149|(1:151)|152))(3:153|(1:155)|156)|121|(1:123)|124|(1:126)|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|(3:143|(1:145)(1:148)|(3:405|342|345))|(1:347)|403|348|(1:352)(2:353|(1:355)(11:357|358|(3:401|360|(3:365|(1:367)|368)(1:364))|399|371|(2:373|375)(1:374)|(2:383|(1:385))(1:381)|388|(1:390)|391|392))|356|358|(0)|399|371|(0)(0)|(1:377)|383|(0)|388|(0)|391|392)))))(2:83|(1:85)(2:170|(1:172)(3:173|(1:175)(1:177)|176)))|403|348|(0)(0)|356|358|(0)|399|371|(0)(0)|(0)|383|(0)|388|(0)|391|392) */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0a65, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0a66, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0aea, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0aeb, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        r1 = X.C2188811AlT.LIZ();
        r1.append("AwemePushUtils.createNotification setCancelIntent/addActionButtons error: ");
        r1.append(r2.getMessage());
        X.C2188811AlT.LIZIZ(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0a6c A[Catch: Exception -> 0x0b22, TryCatch #4 {Exception -> 0x0b22, blocks: (B:352:0x0a6c, B:358:0x0a93, B:388:0x0b01, B:390:0x0b0c, B:391:0x0b1d, B:387:0x0aeb, B:370:0x0ab8, B:353:0x0a70, B:355:0x0a87, B:357:0x0a8e, B:350:0x0a66, B:371:0x0abb, B:377:0x0ac9, B:379:0x0ad3, B:383:0x0adc, B:385:0x0ae6, B:360:0x0a97, B:365:0x0aad, B:368:0x0ab3, B:348:0x0a60), top: B:403:0x0a60, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0a70 A[Catch: Exception -> 0x0b22, TryCatch #4 {Exception -> 0x0b22, blocks: (B:352:0x0a6c, B:358:0x0a93, B:388:0x0b01, B:390:0x0b0c, B:391:0x0b1d, B:387:0x0aeb, B:370:0x0ab8, B:353:0x0a70, B:355:0x0a87, B:357:0x0a8e, B:350:0x0a66, B:371:0x0abb, B:377:0x0ac9, B:379:0x0ad3, B:383:0x0adc, B:385:0x0ae6, B:360:0x0a97, B:365:0x0aad, B:368:0x0ab3, B:348:0x0a60), top: B:403:0x0a60, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0ac9 A[Catch: Exception -> 0x0aea, TryCatch #0 {Exception -> 0x0aea, blocks: (B:371:0x0abb, B:377:0x0ac9, B:379:0x0ad3, B:383:0x0adc, B:385:0x0ae6), top: B:399:0x0abb, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0ae6 A[Catch: Exception -> 0x0aea, TRY_LEAVE, TryCatch #0 {Exception -> 0x0aea, blocks: (B:371:0x0abb, B:377:0x0ac9, B:379:0x0ad3, B:383:0x0adc, B:385:0x0ae6), top: B:399:0x0abb, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0b0c A[Catch: Exception -> 0x0b22, TryCatch #4 {Exception -> 0x0b22, blocks: (B:352:0x0a6c, B:358:0x0a93, B:388:0x0b01, B:390:0x0b0c, B:391:0x0b1d, B:387:0x0aeb, B:370:0x0ab8, B:353:0x0a70, B:355:0x0a87, B:357:0x0a8e, B:350:0x0a66, B:371:0x0abb, B:377:0x0ac9, B:379:0x0ad3, B:383:0x0adc, B:385:0x0ae6, B:360:0x0a97, B:365:0x0aad, B:368:0x0ab3, B:348:0x0a60), top: B:403:0x0a60, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0a97 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0a36 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0217  */
    /* JADX WARN: Type inference failed for: r14v17, types: [X.0Vvr] */
    /* JADX WARN: Type inference failed for: r1v85, types: [com.ss.android.ugc.awemepushapi.IPushApi] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0Vvr] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v36, types: [X.0VyP] */
    /* JADX WARN: Type inference failed for: r9v38, types: [X.0Vxh] */
    /* JADX WARN: Type inference failed for: r9v39, types: [X.0Vw2, X.0Vxe] */
    /* JADX WARN: Type inference failed for: r9v40, types: [X.0Vw3, X.0Vxe] */
    /* JADX WARN: Type inference failed for: r9v41, types: [X.0Vxj] */
    /* JADX WARN: Type inference failed for: r9v42, types: [X.0Vxe] */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44, types: [X.0Vvz, X.0Vxe] */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.app.Notification LIZJ(android.content.Context r20, X.C814730Vxf r21, android.graphics.Bitmap r22, android.graphics.Bitmap r23, android.content.Intent r24, boolean r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C814710Vxd.LIZJ(android.content.Context, X.0Vxf, android.graphics.Bitmap, android.graphics.Bitmap, android.content.Intent, boolean):android.app.Notification");
    }
}

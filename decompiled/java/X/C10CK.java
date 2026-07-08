package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.AwS134S0101000_28;

/* JADX INFO: renamed from: X.10CK, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10CK {
    public final Context LIZ;
    public final PermissionConfigure LIZIZ;
    public final MutableLiveData<C1644450stX<Integer, Boolean>> LIZJ;
    public final MutableLiveData LIZLLL;
    public final MutableLiveData<C1644450stX<Boolean, String>> LJ;
    public final MutableLiveData LJFF;
    public boolean LJI;

    public final String LIZIZ() {
        VideoPublishEditModel videoPublishEditModel = this.LIZIZ.getVideoPublishEditModel();
        if (TextUtils.isEmpty(videoPublishEditModel != null ? videoPublishEditModel.playlist_name : null)) {
            return "";
        }
        String string = this.LIZ.getString(2131838198);
        Object[] objArr = new Object[1];
        VideoPublishEditModel videoPublishEditModel2 = this.LIZIZ.getVideoPublishEditModel();
        objArr[0] = videoPublishEditModel2 != null ? videoPublishEditModel2.playlist_name : null;
        return C786410Ut5.j4(string, Arrays.copyOf(objArr, 1));
    }

    public final void LIZ(int i) {
        this.LIZJ.setValue(new C1644450stX<>(new Pair(Integer.valueOf(i), Boolean.TRUE)));
    }

    public final void LIZJ(int i) {
        String str;
        String strJ4;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 4) {
                        if (C298660BnE.LIZIZ && this.LJI) {
                            VideoPublishEditModel videoPublishEditModel = this.LIZIZ.getVideoPublishEditModel();
                            String str2 = null;
                            if (videoPublishEditModel != null) {
                                str = videoPublishEditModel.playlist_name;
                            } else {
                                str = null;
                            }
                            if (!TextUtils.isEmpty(str)) {
                                String string = this.LIZ.getString(2131849229);
                                Object[] objArr = new Object[1];
                                VideoPublishEditModel videoPublishEditModel2 = this.LIZIZ.getVideoPublishEditModel();
                                if (videoPublishEditModel2 != null) {
                                    str2 = videoPublishEditModel2.playlist_name;
                                }
                                objArr[0] = str2;
                                strJ4 = C786410Ut5.j4(string, Arrays.copyOf(objArr, 1));
                            } else {
                                strJ4 = "";
                            }
                            if (TextUtils.isEmpty(strJ4)) {
                                LIZLLL(4, this.LIZ.getString(2131834701));
                                return;
                            } else {
                                LIZLLL(4, strJ4);
                                return;
                            }
                        }
                        LIZ(4);
                        return;
                    }
                    return;
                }
                if (this.LJI) {
                    LIZLLL(2, LIZIZ());
                    return;
                } else {
                    LIZ(2);
                    return;
                }
            }
            if (this.LJI) {
                String strLIZIZ = LIZIZ();
                if (TextUtils.isEmpty(strLIZIZ)) {
                    LIZLLL(1, this.LIZ.getString(2131834701));
                    return;
                } else {
                    LIZLLL(1, strLIZIZ);
                    return;
                }
            }
            LIZ(1);
            return;
        }
        LIZ(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10CK(android.content.Context r8, com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure r9) {
        /*
            r7 = this;
            r7.<init>()
            r7.LIZ = r8
            r7.LIZIZ = r9
            androidx.lifecycle.MutableLiveData r6 = new androidx.lifecycle.MutableLiveData
            r6.<init>()
            r7.LIZJ = r6
            r7.LIZLLL = r6
            androidx.lifecycle.MutableLiveData r4 = new androidx.lifecycle.MutableLiveData
            r4.<init>()
            r7.LJ = r4
            r7.LJFF = r4
            int r0 = r9.getCurrentPermission()
            r5 = 1
            if (r0 != 0) goto L82
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.getVideoPublishEditModel()
            if (r0 == 0) goto L80
            java.lang.String r0 = r0.playlist_name
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L82
            r0 = 1
        L2f:
            r7.LJI = r0
            X.0stX r3 = new X.0stX
            int r0 = r9.getCurrentPermission()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            r3.<init>(r0)
            r6.setValue(r3)
            X.0stX r3 = new X.0stX
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.getVideoPublishEditModel()
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel r0 = r0.commerceModel
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel r0 = r0.getTcmModel()
            if (r0 == 0) goto L7e
            int r1 = r0.getTcmPreventSelfSee()
            r0 = 2
            if (r1 != r0) goto L7e
        L65:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = ""
            r1.<init>(r2, r0)
            r3.<init>(r1)
            r4.setValue(r3)
            kotlin.jvm.internal.AwS642S0100000_28 r1 = new kotlin.jvm.internal.AwS642S0100000_28
            r0 = 37
            r1.<init>(r7, r0)
            return
        L7e:
            r5 = 0
            goto L65
        L80:
            r0 = 0
            goto L28
        L82:
            r0 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10CK.<init>(android.content.Context, com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure):void");
    }

    public final void LIZLLL(int i, String str) {
        int i2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        i2 = 2131838197;
                    } else {
                        i2 = 2131849230;
                    }
                } else {
                    i2 = 2131845722;
                }
            } else {
                i2 = 2131845723;
            }
        } else {
            i2 = 2131845724;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(this.LIZ);
        c1397580mTM.LJFF(i2);
        c1397580mTM.LIZIZ(str);
        C985403tE.LIZ(c1397580mTM, new AwS134S0101000_28(this, i, 4));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }
}

package Y;

import X.C0CHQ;
import X.C0L8M;
import X.C0L8O;
import X.C0L8Q;
import X.C0L90;
import X.C0M6O;
import X.C0M6P;
import X.C0M6R;
import X.C1389890mGx;
import X.C1397660mTU;
import X.C13LP;
import X.C1499900p8O;
import X.C1637890six;
import X.C1688680u2s;
import X.C19EG;
import X.C298100BmK;
import X.C528550Ko9;
import X.C528910Koj;
import X.C529210KpD;
import X.C529740Kq4;
import X.C530420KrA;
import X.C543670LTx;
import X.C765202yo;
import X.C810670Vr7;
import X.InterfaceC528930Kol;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.MediaPickerConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lth.o;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
public class AObjectS310S0200000_8 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public AObjectS310S0200000_8(MvThemeData mvThemeData, int i) {
        this.$t = i;
        this.l0 = mvThemeData;
        this.l1 = null;
    }

    public static final Object invoke$0(AObjectS310S0200000_8 aObjectS310S0200000_8, Object obj) {
        C530420KrA c530420KrA = (C530420KrA) aObjectS310S0200000_8.l0;
        Context context = (Context) aObjectS310S0200000_8.l1;
        C529210KpD c529210KpD = (C529210KpD) obj;
        c530420KrA.getClass();
        C530420KrA.LLLI(1, c529210KpD.LIZIZ, c529210KpD.LIZJ);
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("errorCode", String.valueOf(c529210KpD.LJ));
        c543670LTx.LIZ.put("errorMsg", c529210KpD.LJFF);
        C1637890six.LJ("aweme_movie_import_error_rate", 1, c543670LTx.LJ());
        C528910Koj.LIZ(context, c529210KpD.LJ, -1, 0, 24);
        return null;
    }

    public static final Object invoke$1(AObjectS310S0200000_8 aObjectS310S0200000_8, Object obj) throws JSONException {
        ArrayList arrayList = (ArrayList) obj;
        if (!arrayList.isEmpty()) {
            ((MvChoosePhotoScene) aObjectS310S0200000_8.l0).selectMediaModel.clear();
            ((MvChoosePhotoScene) aObjectS310S0200000_8.l0).selectMediaModel.addAll(arrayList);
            String strValidateSelectedMedia = ((MvChoosePhotoScene) aObjectS310S0200000_8.l0).validateSelectedMedia((TikTokMediaModel) C13LP.LJJJLL(arrayList), (MediaPickerConfig) aObjectS310S0200000_8.l1);
            if (strValidateSelectedMedia != null) {
                C19EG fragmentActivity = ((MvChoosePhotoScene) aObjectS310S0200000_8.l0).getFragmentActivity();
                if (fragmentActivity != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(fragmentActivity);
                    c1389890mGx.LJIIJ(strValidateSelectedMedia);
                    c1389890mGx.LJIIJJI();
                    MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) aObjectS310S0200000_8.l0;
                    mvChoosePhotoScene.reportReferenceWarning(mvChoosePhotoScene.resolveWarningType((MediaPickerConfig) aObjectS310S0200000_8.l1, strValidateSelectedMedia));
                }
            } else {
                ((MvChoosePhotoScene) aObjectS310S0200000_8.l0).processLibraryBeforeFinish(null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS310S0200000_8 aObjectS310S0200000_8, Object obj) {
        ((C529740Kq4) aObjectS310S0200000_8.l0).LLLLLJLJLL((TikTokMediaModel) obj, -1, (C0L90) aObjectS310S0200000_8.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS310S0200000_8 aObjectS310S0200000_8, Object obj) {
        InterfaceC528930Kol interfaceC528930Kol = (InterfaceC528930Kol) aObjectS310S0200000_8.l0;
        MediaModel mediaModel = (MediaModel) aObjectS310S0200000_8.l1;
        C529210KpD c529210KpD = (C529210KpD) obj;
        C528550Ko9.LIZIZ(0, c529210KpD.LIZIZ, c529210KpD.LIZJ);
        interfaceC528930Kol.onSuccess();
        ChooseMediaExtensionKt.LIZIZ(c529210KpD, mediaModel);
        C528550Ko9.LIZ(mediaModel, true);
        C0CHQ.LIZ().LJIILL().updateMediaTypeCache(mediaModel.LJFF());
        if (C298100BmK.LIZ()) {
            C0CHQ.LIZ().LJIILL().updateVideoInfoCache(mediaModel.LJFF());
            C0CHQ.LIZ().LJIILL().updateVideoOriginAudioCache(mediaModel.LJFF());
            return null;
        }
        return null;
    }

    public static final Object invoke$4(AObjectS310S0200000_8 aObjectS310S0200000_8, Object obj) {
        C1688680u2s.LJIIIZ((Activity) aObjectS310S0200000_8.l0, (Intent) aObjectS310S0200000_8.l1, (List) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS310S0200000_8 aObjectS310S0200000_8, Object obj) {
        C0L8M c0l8m = (C0L8M) aObjectS310S0200000_8.l0;
        List<C0L8Q> list = (List) aObjectS310S0200000_8.l1;
        if (((Boolean) obj).booleanValue()) {
            c0l8m.LIZIZ(list);
        } else {
            c0l8m.LIZ(new C0L8O("reverse video failed"));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS310S0200000_8 aObjectS310S0200000_8, Object obj) {
        MvThemeData mvThemeData = (MvThemeData) aObjectS310S0200000_8.l0;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) aObjectS310S0200000_8.l1;
        C1397660mTU c1397660mTU = (C1397660mTU) obj;
        String id = mvThemeData.effect.getId();
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(o.LIZ, 0, "mv_template").edit();
        editorEdit.putBoolean(id, true);
        C1499900p8O.LIZ(editorEdit);
        if (onClickListener != null) {
            onClickListener.onClick(c1397660mTU.LIZ(), c1397660mTU.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AObjectS310S0200000_8 aObjectS310S0200000_8, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) aObjectS310S0200000_8.l0;
        C0M6O c0m6o = (C0M6O) aObjectS310S0200000_8.l1;
        List list = (List) obj;
        awemeListFragmentImpl.getClass();
        if (!list.isEmpty()) {
            C0M6P c0m6pLJIILIIL = c0m6o.LJIILIIL((C765202yo) ListProtector.get(list, 0));
            if (c0m6pLJIILIIL == null) {
                return Unit.LIZ;
            }
            if (C0M6R.LIZIZ(c0m6pLJIILIIL.LIZJ)) {
                awemeListFragmentImpl.AU();
            }
        }
        return Unit.LIZ;
    }

    public AObjectS310S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

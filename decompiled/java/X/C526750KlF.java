package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KlF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mediachoose.EditorProChooseResultImpl$mobUploadContentNext$1", f = "EditorProChooseResultImpl.kt", l = {}, m = "invokeSuspend")
public final class C526750KlF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<MediaModel> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C526750KlF(List<? extends MediaModel> list, int i, Intent intent, String str, long j, InterfaceC1364105Vn<? super C526750KlF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = intent;
        this.LLILZ = str;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526750KlF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        int i;
        String stringExtra;
        VEUtils.VEVideoFileInfo videoFileInfo;
        C1C7U.LIZ("EditorProChooseResultImpl@9e23.mobUploadContentNext$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<MediaModel> list = this.LL;
        ArrayList<MediaModel> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<MediaModel> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().clone());
        }
        for (MediaModel mediaModel : arrayList) {
            if (mediaModel.type == 4) {
                if (C297650Blb.LIZ()) {
                    C2356009La c2356009La = C2356009La.LIZ;
                    String strLJFF = mediaModel.LJFF();
                    c2356009La.getClass();
                    videoFileInfo = C2356009La.LIZ(strLJFF);
                } else {
                    videoFileInfo = VEUtils.getVideoFileInfo(mediaModel.LJFF());
                }
                if (videoFileInfo != null) {
                    int i2 = videoFileInfo.rotation;
                    if (i2 != 90 && i2 != 270) {
                        mediaModel.width = videoFileInfo.width;
                        mediaModel.height = videoFileInfo.height;
                    } else {
                        mediaModel.width = videoFileInfo.height;
                        mediaModel.height = videoFileInfo.width;
                    }
                }
            }
        }
        if (this.LL.size() > 1) {
            str = "multiple_content";
        } else {
            str = "single_content";
        }
        int i3 = this.LLILLJJLI;
        if (i3 <= 0) {
            i3 = 0;
        }
        int size = this.LL.size() - this.LLILLJJLI;
        if (this.LL.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        String strLIZ = C525670KjV.LIZ(arrayList);
        boolean booleanExtra = this.LLILLL.getBooleanExtra("is_pip", false);
        int iLIZ = C530690Krb.LIZ(this.LL);
        boolean booleanExtra2 = this.LLILLL.getBooleanExtra("Key_replace_item", false);
        C528230Knd c528230KndLIZ = C523870Kgb.LIZ(this.LLILLL);
        String str2 = this.LLILZ;
        C528210Knb c528210Knb = new C528210Knb(null, str2, str, i3, size, str2, z, strLIZ, true, booleanExtra, booleanExtra2, iLIZ, this.LL, c528230KndLIZ);
        long j = this.LLILZIL;
        Intent intent = this.LLILLL;
        if (j > 0) {
            i = (int) j;
        } else {
            i = 0;
        }
        c528210Knb.LIZIZ(i);
        C0LAB c0lab = c528210Knb.LIZIZ;
        String stringExtra2 = null;
        try {
            stringExtra = intent.getStringExtra("shoot_way");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        c0lab.LJ("shoot_way", stringExtra);
        c0lab.LJ("creation_id", C537520L6g.LIZ(intent).getCreationId());
        c0lab.LJ("creation_id", C537520L6g.LIZ(intent).getCreationId());
        c0lab.LJ("upload_method", "click_button");
        try {
            stringExtra2 = intent.getStringExtra("upload_next_method");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        c0lab.LJ("upload_next_method", stringExtra2);
        c528210Knb.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProChooseResultImpl@9e23.mobUploadContentNext$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.share.systemshare.SystemShareViewModel;
import com.ss.android.vesdk.VEUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.09OC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.systemshare.SystemShareViewModel$handleDmFlow$1$2", f = "SystemShareViewModel.kt", l = {}, m = "invokeSuspend")
public final class C09OC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SystemShareViewModel LL;
    public final /* synthetic */ C19EG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09OC(SystemShareViewModel systemShareViewModel, C19EG c19eg, InterfaceC1364105Vn<? super C09OC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = systemShareViewModel;
        this.LLILLJJLI = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09OC(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws IOException {
        ArrayList arrayList;
        boolean z;
        Bitmap bitmapDecodeFile;
        C1C7U.LIZ("SystemShareViewModel@28df.handleDmFlow$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SystemShareViewModel systemShareViewModel = this.LL;
        List<? extends Uri> list = systemShareViewModel.LLILZ;
        ArrayList<String> arrayList2 = null;
        if (list != null) {
            C19EG c19eg = this.LLILLJJLI;
            arrayList2 = new ArrayList();
            for (Uri uri : list) {
                C2360509Mt c2360509Mt = C2360509Mt.LIZ;
                CreativeInfo creativeInfo = systemShareViewModel.LLIZ;
                c2360509Mt.getClass();
                String strLJ = C2360509Mt.LJ(c19eg, uri, creativeInfo, false);
                if (strLJ != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SystemShareActivity realPath = ");
                    sbLIZ.append(strLJ);
                    C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    arrayList2.add(strLJ);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (arrayList2 != null) {
            arrayList = new ArrayList();
            for (String str : arrayList2) {
                int i = 1;
                boolean zLJJIII = C2471909mP.LJJIII(str, true, 4);
                String strLJIJJLI = C2471909mP.LJIJJLI(str, true);
                String[] strArr = C2471909mP.LJI;
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (a0.LJJIIZI(strLJIJJLI, strArr[i2], false)) {
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                MediaModel mediaModel = new MediaModel(UUID.randomUUID().toString());
                long j = 3000;
                if (!zLJJIII && !z) {
                    VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
                    if (videoFileInfo != null) {
                        long j2 = videoFileInfo.duration;
                        if (j2 > 0) {
                            j = j2;
                        }
                        mediaModel.duration = j;
                        mediaModel.width = videoFileInfo.width;
                        mediaModel.height = videoFileInfo.height;
                        mediaModel.LJIILL(str);
                        mediaModel.type = 4;
                    }
                } else {
                    Pair<Integer, Integer> pairLIZJ = C097U.LIZJ(str);
                    mediaModel.duration = 3000L;
                    mediaModel.width = pairLIZJ.getFirst().intValue();
                    mediaModel.height = pairLIZJ.getSecond().intValue();
                    mediaModel.LJIILL(str);
                    if (!zLJJIII) {
                        i = 2;
                    }
                    mediaModel.type = i;
                }
                if (mediaModel.type == 4) {
                    bitmapDecodeFile = C2471809mO.LIZIZ(str);
                } else {
                    bitmapDecodeFile = BitmapFactory.decodeFile(str);
                }
                if (bitmapDecodeFile != null) {
                    arrayList3.add(bitmapDecodeFile);
                }
                arrayList.add(mediaModel);
            }
        } else {
            arrayList = new ArrayList();
        }
        this.LL.LLJJIJIL.postValue(new C09OD(arrayList3, arrayList));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SystemShareViewModel@28df.handleDmFlow$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.live.render.engine.alphaplayer.model.VideoFileModelKotlin;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1CwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.bytedance.live.render.engine.alphaplayer.LiveGiftPlayControllerKotlin$start$4$1", f = "LiveGiftPlayControllerKotlin.kt", l = {}, m = "invokeSuspend")
public final class C2246611CwV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DataSource>, Object> {
    public final /* synthetic */ C2246651CwZ LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ Function1<C1141050fnb, Unit> LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2246611CwV(long j, C2246651CwZ c2246651CwZ, List list, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LL = c2246651CwZ;
        this.LLILLJJLI = list;
        this.LLILLL = function1;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2246611CwV(this.LLILZ, this.LL, this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.util.List] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveGiftPlayControllerKotlin@f497.start$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1149270g0r.LIZIZ("LiveGiftPlayControllerKt_gift_video_engine", "start withContext(Dispatchers.Default)");
        List<String> listLJIILJJIL = this.LL.LJIILJJIL(this.LLILLJJLI);
        if (((ArrayList) listLJIILJJIL).isEmpty()) {
            Function1<C1141050fnb, Unit> function1 = this.LLILLL;
            if (function1 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("configJson is null, filePathList = ");
                sbLIZ.append(this.LLILLJJLI);
                function1.invoke(new C1141050fnb(-21, C2188811AlT.LIZIZ(sbLIZ), null));
            }
            C1C7U.LIZIZ("LiveGiftPlayControllerKotlin@f497.start$4$1");
            return null;
        }
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        try {
            C2246651CwZ c2246651CwZ = this.LL;
            List<String> list = this.LLILLJJLI;
            c2246651CwZ.getClass();
            ?? LJIILLIIL = C2246651CwZ.LJIILLIIL(listLJIILJJIL, list);
            c259800zU.element = LJIILLIIL;
            c259800zU2.element = LJIILLIIL.get(0);
            e = null;
        } catch (Exception e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start, e = ");
            sbLIZ2.append(e.getMessage());
            sbLIZ2.append(", ");
            sbLIZ2.append(this.LL.LJIILL());
            C1141240fnu.LIZJ("LiveGiftPlayControllerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2), e);
        }
        if (c259800zU2.element == 0) {
            C2246651CwZ c2246651CwZ2 = this.LL;
            synchronized (c2246651CwZ2.LJI) {
                try {
                    InterfaceC2246631CwX interfaceC2246631CwX = c2246651CwZ2.LJFF;
                    if (interfaceC2246631CwX != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Gson convert failed: configJsonList = ");
                        sbLIZ3.append(listLJIILJJIL);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        interfaceC2246631CwX.LIZIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            Function1<C1141050fnb, Unit> function12 = this.LLILLL;
            if (function12 != null) {
                function12.invoke(new C1141050fnb(-21, "configJson parse error", e));
            }
            C1C7U.LIZIZ("LiveGiftPlayControllerKotlin@f497.start$4$1");
            return null;
        }
        DataSource dataSource = new DataSource();
        dataSource.setMessageId(this.LLILZ);
        String str = (String) C13LP.LJJJLL(this.LLILLJJLI);
        if (str == null) {
            str = "";
        }
        VideoFileModelKotlin videoFileModelKotlin = (VideoFileModelKotlin) c259800zU2.element;
        VideoFileModelKotlin.Item item = videoFileModelKotlin.landscape;
        if (item != null) {
            C2246651CwZ c2246651CwZ3 = this.LL;
            List<String> list2 = this.LLILLJJLI;
            c2246651CwZ3.getClass();
            DataSource.DataInfo dataInfo = new DataSource.DataInfo(C2246651CwZ.LJIIZILJ(str, videoFileModelKotlin));
            dataInfo.setPathList(C2246651CwZ.LJIJ(list2, (List) c259800zU.element));
            dataInfo.setScaleType(item.align);
            dataInfo.setVersion(item.version);
            dataInfo.setTotalFrame(item.totalFrame);
            dataInfo.setVideoWidth(item.videoWidth);
            dataInfo.setVideoHeight(item.videoHeight);
            dataInfo.setActualWidth(item.actualWidth);
            dataInfo.setActualHeight(item.actualHeight);
            dataInfo.setAlphaArea(item.alphaFrame);
            dataInfo.setRgbArea(item.rgbFrame);
            dataInfo.setMasks(item.masks);
            dataInfo.setLayers(item.LIZ());
            dataSource.setLandscapeDataInfo(dataInfo);
        }
        VideoFileModelKotlin videoFileModelKotlin2 = (VideoFileModelKotlin) c259800zU2.element;
        VideoFileModelKotlin.Item item2 = videoFileModelKotlin2.portrait;
        if (item2 != null) {
            C2246651CwZ c2246651CwZ4 = this.LL;
            List<String> list3 = this.LLILLJJLI;
            c2246651CwZ4.getClass();
            DataSource.DataInfo dataInfo2 = new DataSource.DataInfo(C2246651CwZ.LJIJI(str, videoFileModelKotlin2));
            dataInfo2.setPathList(C2246651CwZ.LJIJJ(list3, (List) c259800zU.element));
            dataInfo2.setScaleType(item2.align);
            dataInfo2.setVersion(item2.version);
            dataInfo2.setTotalFrame(item2.totalFrame);
            dataInfo2.setVideoWidth(item2.videoWidth);
            dataInfo2.setVideoHeight(item2.videoHeight);
            dataInfo2.setActualWidth(item2.actualWidth);
            dataInfo2.setActualHeight(item2.actualHeight);
            dataInfo2.setAlphaArea(item2.alphaFrame);
            dataInfo2.setRgbArea(item2.rgbFrame);
            dataInfo2.setMasks(item2.masks);
            dataInfo2.setLayers(item2.LIZ());
            dataSource.setPortraitDataInfo(dataInfo2);
            dataSource.setLandscapeDataInfo(dataInfo2);
        }
        dataSource.setAutoRelease(this.LL.LJIIIZ);
        dataSource.setLoop(this.LL.LJIIJ);
        C1C7U.LIZIZ("LiveGiftPlayControllerKotlin@f497.start$4$1");
        return dataSource;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DataSource> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

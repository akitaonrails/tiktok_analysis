package X;

import android.content.Context;
import com.ss.android.ugc.aweme.interfaces.ITemplateMusicService;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.node.MusicDownloadNodeKt$musicDownloadNode$1", f = "MusicDownloadNode.kt", l = {48, 49}, m = "invokeSuspend")
public final class C531480Kss extends C09AX implements Function2<C531490Kst, InterfaceC1364105Vn<? super C189200o6<? extends List<? extends C531370Ksh>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C531480Kss(InterfaceC1364105Vn<? super C531480Kss> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531480Kss c531480Kss = new C531480Kss(interfaceC1364105Vn);
        c531480Kss.LLILLJJLI = obj;
        return c531480Kss;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        C1C7U.LIZ("MusicDownloadNodeKt@de15.musicDownloadNode$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            objLIZ = ((C189200o6) obj).m10unboximpl();
        } else {
            C155000ia.LIZIZ(obj);
            C531490Kst c531490Kst = (C531490Kst) this.LLILLJJLI;
            ITemplateMusicService iTemplateMusicServiceLIZ = C524940KiK.LIZ();
            Pair<String, List<String>> pairLIZ = C531530Ksx.LIZ(c531490Kst.LIZ, c531490Kst.LIZIZ.ugcTemplateData, c531490Kst.LIZJ);
            String first = pairLIZ.getFirst();
            List<String> second = pairLIZ.getSecond();
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (iTemplateMusicServiceLIZ == null) {
                objLIZ = C13BV.INSTANCE;
                C189200o6.m2constructorimpl(objLIZ);
            } else if (first != null && first.length() != 0) {
                List listSingletonList = Collections.singletonList(first);
                this.LL = 1;
                objLIZ = C531500Ksu.LIZ(c531490Kst, listSingletonList, contextLIZ, true, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("MusicDownloadNodeKt@de15.musicDownloadNode$1");
                    return objLJFF;
                }
            } else if (true ^ second.isEmpty()) {
                this.LL = 2;
                objLIZ = C531500Ksu.LIZ(c531490Kst, second, contextLIZ, false, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("MusicDownloadNodeKt@de15.musicDownloadNode$1");
                    return objLJFF;
                }
            } else {
                objLIZ = C13BV.INSTANCE;
                C189200o6.m2constructorimpl(objLIZ);
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("MusicDownloadNodeKt@de15.musicDownloadNode$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C531490Kst c531490Kst, InterfaceC1364105Vn<? super C189200o6<? extends List<? extends C531370Ksh>>> interfaceC1364105Vn) {
        return ((a) create(c531490Kst, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

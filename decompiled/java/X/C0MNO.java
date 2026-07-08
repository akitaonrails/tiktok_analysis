package X;

import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.event.EventData;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MNO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MNO extends C0LNW<C0MNS> {
    public final C567290MMt LJ = new C567290MMt();

    @Override // X.C0LNW
    public final String LIZLLL() {
        return "No video sharing data provided";
    }

    @Override // X.C0LNW
    public final C0MNS LIZJ(C0MNQ c0mnq) {
        return c0mnq.LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C0MNS r7, com.ss.android.ugc.aweme.creative.model.CreativeInfo r8, X.InterfaceC1364105Vn r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C0MNP
            if (r0 == 0) goto L59
            r4 = r9
            X.0MNP r4 = (X.C0MNP) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L5f
            X.C155000ia.LIZIZ(r1)
        L22:
            return r1
        L23:
            X.C155000ia.LIZIZ(r1)
            X.0MMt r0 = r6.LJ
            r0.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r1 = r7.LIZ
            if (r1 == 0) goto L3f
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L3f
            r2.add(r1)
        L3f:
            java.lang.String r1 = r7.LIZIZ
            if (r1 == 0) goto L4e
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L4e
            r2.add(r1)
        L4e:
            X.0MMt r0 = r6.LJ
            r4.LLILLL = r3
            java.lang.Object r1 = r0.LIZ(r2, r8, r4)
            if (r1 != r5) goto L22
            return r5
        L59:
            X.0MNP r4 = new X.0MNP
            r4.<init>(r6, r9)
            goto L12
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MNO.LJIIIIZZ(X.0MNS, com.ss.android.ugc.aweme.creative.model.CreativeInfo, X.05Vn):java.lang.Object");
    }

    @Override // X.C0LNW
    public final Intent LJFF(CreativeInfo creativeInfo, Object obj, C0MNQ c0mnq, C0MNS c0mns) {
        String str;
        String str2;
        String str3;
        ArrayList<ImportVideoInfo> arrayList;
        C0MNS c0mns2 = c0mns;
        String str4 = (String) obj;
        C567370MNb c567370MNb = this.LIZ;
        C0MNR c0mnr = c0mnq.LIZ;
        if (c0mnr != null) {
            str = c0mnr.LIZIZ;
            str2 = c0mnr.LIZLLL;
            str3 = c0mnr.LIZJ;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        List<C1EJ2> list = c0mns2.LIZJ;
        c567370MNb.getClass();
        Intent intent = new Intent();
        C0MUK.LJIIIZ(intent, C0MUK.LJIIIIZZ());
        C537520L6g.LIZLLL(intent, creativeInfo);
        EditVideoSegment editVideoSegment = new EditVideoSegment(str4, null, C571500MbE.LJIIJ(str4));
        DisplayMetrics displayMetrics = C20642515q3.LJFF().getDisplayMetrics();
        EditPreviewInfo editPreviewInfoLIZ = new C538330L9j(displayMetrics.widthPixels, displayMetrics.heightPixels, 12).LIZ(editVideoSegment);
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(str4, iArr) != 0) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = new ArrayList<>();
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[6];
            int i4 = iArr[8];
            long j = iArr[3];
            arrayList.add(new ImportVideoInfo(i, i2, i3, i4, str4, j, j, null, null, iArr[7], 1.0f, str4, str4, false, null, null, 0L, 98304, null));
        }
        C0MUK.LIZIZ(intent).editModel.editPreviewInfo = editPreviewInfoLIZ;
        C0MUK.LIZIZ(intent).albumModel.importInfoList = arrayList;
        if (!list.isEmpty()) {
            C0MUK.LIZIZ(intent).stickerModel.mentionStickerModel.addAll(C567370MNb.LIZ(list, new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels))));
        }
        intent.putExtra("workspace", C14D2.LIZ(creativeInfo));
        intent.putExtra("origin", 0);
        intent.putExtra("creation_id", creativeInfo.getCreationId());
        if (str == null) {
            str = "add_to_story";
        }
        intent.putExtra("shoot_way", str);
        intent.putExtra("content_type", "share");
        intent.putExtra("content_source", "upload");
        intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
        C0MUK.LIZIZ(intent).creativeFlowData = new CreativeFlowData(null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 32767, null);
        EventData eventData = C0MUK.LIZIZ(intent).eventData;
        if (str2 == null) {
            str2 = "click";
        }
        eventData.shootEnterMethod = str2;
        EventData eventData2 = C0MUK.LIZIZ(intent).eventData;
        if (str3 == null) {
            str3 = "open_story";
        }
        eventData2.enterFrom = str3;
        return intent;
    }

    @Override // X.C0LNW
    public final /* bridge */ /* synthetic */ Object LJI(Context context, C0MNS c0mns, CreativeInfo creativeInfo, InterfaceC1364105Vn interfaceC1364105Vn) {
        return LJIIIIZZ(c0mns, creativeInfo, interfaceC1364105Vn);
    }
}

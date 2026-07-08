package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.IStickerViewService;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AwS461S0200000_26;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0vAY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731880vAY extends AbstractC1731900vAa {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0vAV] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        final AbstractC1732180vB2 abstractC1732180vB2;
        WeakReference<AbstractC1732690vBr> weakReference = C1732220vB6.LIZ;
        AbstractC1732690vBr abstractC1732690vBr = null;
        if (weakReference != null) {
            abstractC1732690vBr = weakReference.get();
        }
        C1731890vAZ c1731890vAZ = new C1731890vAZ();
        if (abstractC1732690vBr == null) {
            c1731890vAZ.LIZIZ = "widget is null, pls check does billboard widget exists";
            completionBlock.onSuccess(c1731890vAZ, "");
            return;
        }
        if ((abstractC1732690vBr instanceof AbstractC1732180vB2) && (abstractC1732180vB2 = (AbstractC1732180vB2) abstractC1732690vBr) != null) {
            final AwS461S0200000_26 awS461S0200000_26 = new AwS461S0200000_26(completionBlock, (CompletionBlock<InterfaceC1731910vAb>) c1731890vAZ, (C1731890vAZ) 0);
            abstractC1732180vB2.LLJJI = new InterfaceC1637930sj1() { // from class: X.0vAV
                @Override // X.InterfaceC1637930sj1
                public final void LLLLLLLLL(String str, String str2, String str3) {
                }

                @Override // X.InterfaceC1637930sj1
                public final void f(List<String> list) {
                }

                @Override // X.InterfaceC1637930sj1
                public final void LLZLI(String str) throws Throwable {
                    boolean z;
                    if (str != null && str.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        awS461S0200000_26.invoke("", "photo path is empty");
                        return;
                    }
                    if (u.LJJIIJZLJL(str, "content://", false)) {
                        ContentResolver contentResolver = abstractC1732180vB2.LLILLL.getContentResolver();
                        Uri uri = UriProtector.parse(str);
                        Cursor cursorLJJJ = C2204961BRm.LJJJ(contentResolver, uri, null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmZZPb2TzaSm6ItPsk1vIiKahyiP6OhAu9PLcc3AYBgI9VFdS5BVvAf2sd63EmvxctYfjQ4cqHr0nA5IzAkZCiHZ6/0nh8k9tiWw==", null));
                        if (cursorLJJJ == null) {
                            str = String.valueOf(uri.getPath());
                        } else {
                            cursorLJJJ.moveToFirst();
                            str = cursorLJJJ.getString(cursorLJJJ.getColumnIndex("_data"));
                            cursorLJJJ.close();
                        }
                    }
                    awS461S0200000_26.invoke(str, "");
                }
            };
            IStickerViewService iStickerViewService = (IStickerViewService) PluggableExtentionKt.pluggableSpi$default(IStickerViewService.class, false, false, false, 14, null);
            if (iStickerViewService != null) {
                iStickerViewService.initGalleryModule(C1388190mED.LIZ(abstractC1732180vB2.LLILLL), abstractC1732180vB2.LLJJI);
            }
            IStickerViewService iStickerViewService2 = (IStickerViewService) PluggableExtentionKt.pluggableSpi$default(IStickerViewService.class, false, false, false, 14, null);
            if (iStickerViewService2 == null) {
                return;
            }
            iStickerViewService2.selectFromGallery();
            return;
        }
        c1731890vAZ.LIZIZ = "widget is not ECBillboardBroadcastBaseWidget";
        c1731890vAZ.LIZ = "";
        completionBlock.onSuccess(c1731890vAZ, "");
    }
}

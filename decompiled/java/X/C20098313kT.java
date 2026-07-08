package X;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: X.13kT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20098313kT {
    public static String[] LIZ(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C20098713kX LIZIZ(View view, C20098713kX c20098713kX) {
        ContentInfo contentInfoLIZIZ = c20098713kX.LIZ.LIZIZ();
        Objects.requireNonNull(contentInfoLIZIZ);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoLIZIZ);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        if (contentInfoPerformReceiveContent == contentInfoLIZIZ) {
            return c20098713kX;
        }
        return new C20098713kX(new C20098513kV(contentInfoPerformReceiveContent));
    }

    public static void LIZJ(View view, String[] strArr, final InterfaceC20096813kE interfaceC20096813kE) {
        if (interfaceC20096813kE == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListener(interfaceC20096813kE) { // from class: X.13kU
                public final InterfaceC20096813kE LIZ;

                {
                    this.LIZ = interfaceC20096813kE;
                }

                @Override // android.view.OnReceiveContentListener
                public final ContentInfo onReceiveContent(View view2, ContentInfo contentInfo) {
                    C20098713kX c20098713kX = new C20098713kX(new C20098513kV(contentInfo));
                    C20098713kX c20098713kXLIZ = this.LIZ.LIZ(view2, c20098713kX);
                    if (c20098713kXLIZ == null) {
                        return null;
                    }
                    if (c20098713kXLIZ == c20098713kX) {
                        return contentInfo;
                    }
                    ContentInfo contentInfoLIZIZ = c20098713kXLIZ.LIZ.LIZIZ();
                    Objects.requireNonNull(contentInfoLIZIZ);
                    return contentInfoLIZIZ;
                }
            });
        }
    }
}

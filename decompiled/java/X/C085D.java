package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: renamed from: X.085D, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C085D {
    public static final C085H LIZ;

    static {
        C085H c085h;
        try {
            final WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface = (WebViewProviderFactoryBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewProviderFactoryBoundaryInterface.class, C085A.LIZ());
            c085h = new C085H(webViewProviderFactoryBoundaryInterface) { // from class: X.085E
                public final WebViewProviderFactoryBoundaryInterface LIZ;

                @Override // X.C085H
                public final String[] LIZ() {
                    return this.LIZ.getSupportedFeatures();
                }

                @Override // X.C085H
                public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
                    return (WebkitToCompatConverterBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebkitToCompatConverterBoundaryInterface.class, this.LIZ.getWebkitToCompatConverter());
                }

                {
                    this.LIZ = webViewProviderFactoryBoundaryInterface;
                }
            };
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            c085h = new C085H() { // from class: X.085F
                public static final String[] LIZ = new String[0];

                @Override // X.C085H
                public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
                    throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
                }

                @Override // X.C085H
                public final String[] LIZ() {
                    return LIZ;
                }
            };
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            throw new RuntimeException(e4);
        }
        LIZ = c085h;
    }
}

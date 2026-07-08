package X;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.tts.oecverify.BdTuring;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: X.1Dbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259261Dbo {
    public static final boolean LJIIZILJ = Log.isLoggable("ExifInterface", 3);
    public static final List<Integer> LJIJ = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> LJIJI = Arrays.asList(2, 7, 4, 5);
    public static final int[] LJIJJ = {8, 8, 8};
    public static final int[] LJIJJLI = {8};
    public static final byte[] LJIL = {-1, -40, -1};
    public static final byte[] LJJ = {102, 116, 121, 112};
    public static final byte[] LJJI = {109, 105, 102, 49};
    public static final byte[] LJJIFFI = {104, 101, 105, 99};
    public static final byte[] LJJII = {79, 76, 89, 77, 80, 0};
    public static final byte[] LJJIII = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] LJJIIJ = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] LJJIIJZLJL = {101, 88, 73, 102};
    public static final byte[] LJJIIZ = {73, 72, 68, 82};
    public static final byte[] LJJIIZI = {73, 69, 78, 68};
    public static final byte[] LJJIJ = {82, 73, 70, 70};
    public static final byte[] LJJIJIIJI = {87, 69, 66, 80};
    public static final byte[] LJJIJIIJIL = {69, 88, 73, 70};
    public static final byte[] LJJIJIL = {-99, 1, 42};
    public static final byte[] LJJIJL = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] LJJIJLIJ = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] LJJIL = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] LJJIZ = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] LJJJ = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] LJJJI = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] LJJJIL = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] LJJJJ = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final C2259321Dbu LJJJJI;
    public static final C2259321Dbu[][] LJJJJIZL;
    public static final C2259321Dbu[] LJJJJJ;
    public static final C2259321Dbu LJJJJJL;
    public static final C2259321Dbu LJJJJL;
    public static final HashMap<Integer, C2259321Dbu>[] LJJJJLI;
    public static final HashMap<String, C2259321Dbu>[] LJJJJLL;
    public static final HashSet<String> LJJJJZ;
    public static final HashMap<Integer, Integer> LJJJJZI;
    public static final Charset LJJJLIIL;
    public static final byte[] LJJJLL;
    public static final byte[] LJJJLZIJ;
    public static final Pattern LJJJZ;
    public String LIZ;
    public FileDescriptor LIZIZ;
    public int LIZJ;
    public final HashMap<String, C2259241Dbm>[] LIZLLL;
    public final Set<Integer> LJ;
    public ByteOrder LJFF;
    public boolean LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public byte[] LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;

    static {
        C2259321Dbu[] c2259321DbuArr = {new C2259321Dbu("NewSubfileType", 254, 4), new C2259321Dbu("SubfileType", 255, 4), new C2259321Dbu("ImageWidth", 256, 3, 4), new C2259321Dbu("ImageLength", 257, 3, 4), new C2259321Dbu("BitsPerSample", 258, 3), new C2259321Dbu("Compression", 259, 3), new C2259321Dbu("PhotometricInterpretation", 262, 3), new C2259321Dbu("ImageDescription", 270, 2), new C2259321Dbu("Make", 271, 2), new C2259321Dbu("Model", 272, 2), new C2259321Dbu("StripOffsets", 273, 3, 4), new C2259321Dbu("Orientation", 274, 3), new C2259321Dbu("SamplesPerPixel", 277, 3), new C2259321Dbu("RowsPerStrip", 278, 3, 4), new C2259321Dbu("StripByteCounts", 279, 3, 4), new C2259321Dbu("XResolution", 282, 5), new C2259321Dbu("YResolution", 283, 5), new C2259321Dbu("PlanarConfiguration", 284, 3), new C2259321Dbu("ResolutionUnit", 296, 3), new C2259321Dbu("TransferFunction", 301, 3), new C2259321Dbu("Software", 305, 2), new C2259321Dbu("DateTime", 306, 2), new C2259321Dbu("Artist", 315, 2), new C2259321Dbu("WhitePoint", 318, 5), new C2259321Dbu("PrimaryChromaticities", 319, 5), new C2259321Dbu("SubIFDPointer", 330, 4), new C2259321Dbu("JPEGInterchangeFormat", 513, 4), new C2259321Dbu("JPEGInterchangeFormatLength", 514, 4), new C2259321Dbu("YCbCrCoefficients", 529, 5), new C2259321Dbu("YCbCrSubSampling", 530, 3), new C2259321Dbu("YCbCrPositioning", 531, 3), new C2259321Dbu("ReferenceBlackWhite", 532, 5), new C2259321Dbu("Copyright", 33432, 2), new C2259321Dbu("ExifIFDPointer", 34665, 4), new C2259321Dbu("GPSInfoIFDPointer", 34853, 4), new C2259321Dbu("SensorTopBorder", 4, 4), new C2259321Dbu("SensorLeftBorder", 5, 4), new C2259321Dbu("SensorBottomBorder", 6, 4), new C2259321Dbu("SensorRightBorder", 7, 4), new C2259321Dbu("ISO", 23, 3), new C2259321Dbu("JpgFromRaw", 46, 7), new C2259321Dbu("Xmp", OppoPermissionPopupMaskDelayExp.DEFAULT, 1)};
        C2259321Dbu[] c2259321DbuArr2 = {new C2259321Dbu("ExposureTime", 33434, 5), new C2259321Dbu("FNumber", 33437, 5), new C2259321Dbu("ExposureProgram", 34850, 3), new C2259321Dbu("SpectralSensitivity", 34852, 2), new C2259321Dbu("PhotographicSensitivity", 34855, 3), new C2259321Dbu("OECF", 34856, 7), new C2259321Dbu("SensitivityType", 34864, 3), new C2259321Dbu("StandardOutputSensitivity", 34865, 4), new C2259321Dbu("RecommendedExposureIndex", 34866, 4), new C2259321Dbu("ISOSpeed", 34867, 4), new C2259321Dbu("ISOSpeedLatitudeyyy", 34868, 4), new C2259321Dbu("ISOSpeedLatitudezzz", 34869, 4), new C2259321Dbu("ExifVersion", 36864, 2), new C2259321Dbu("DateTimeOriginal", 36867, 2), new C2259321Dbu("DateTimeDigitized", 36868, 2), new C2259321Dbu("OffsetTime", 36880, 2), new C2259321Dbu("OffsetTimeOriginal", 36881, 2), new C2259321Dbu("OffsetTimeDigitized", 36882, 2), new C2259321Dbu("ComponentsConfiguration", 37121, 7), new C2259321Dbu("CompressedBitsPerPixel", 37122, 5), new C2259321Dbu("ShutterSpeedValue", 37377, 10), new C2259321Dbu("ApertureValue", 37378, 5), new C2259321Dbu("BrightnessValue", 37379, 10), new C2259321Dbu("ExposureBiasValue", 37380, 10), new C2259321Dbu("MaxApertureValue", 37381, 5), new C2259321Dbu("SubjectDistance", 37382, 5), new C2259321Dbu("MeteringMode", 37383, 3), new C2259321Dbu("LightSource", 37384, 3), new C2259321Dbu("Flash", 37385, 3), new C2259321Dbu("FocalLength", 37386, 5), new C2259321Dbu("SubjectArea", 37396, 3), new C2259321Dbu("MakerNote", 37500, 7), new C2259321Dbu("UserComment", 37510, 7), new C2259321Dbu("SubSecTime", 37520, 2), new C2259321Dbu("SubSecTimeOriginal", 37521, 2), new C2259321Dbu("SubSecTimeDigitized", 37522, 2), new C2259321Dbu("FlashpixVersion", 40960, 7), new C2259321Dbu("ColorSpace", 40961, 3), new C2259321Dbu("PixelXDimension", 40962, 3, 4), new C2259321Dbu("PixelYDimension", 40963, 3, 4), new C2259321Dbu("RelatedSoundFile", 40964, 2), new C2259321Dbu("InteroperabilityIFDPointer", 40965, 4), new C2259321Dbu("FlashEnergy", 41483, 5), new C2259321Dbu("SpatialFrequencyResponse", 41484, 7), new C2259321Dbu("FocalPlaneXResolution", 41486, 5), new C2259321Dbu("FocalPlaneYResolution", 41487, 5), new C2259321Dbu("FocalPlaneResolutionUnit", 41488, 3), new C2259321Dbu("SubjectLocation", 41492, 3), new C2259321Dbu("ExposureIndex", 41493, 5), new C2259321Dbu("SensingMethod", 41495, 3), new C2259321Dbu("FileSource", 41728, 7), new C2259321Dbu("SceneType", 41729, 7), new C2259321Dbu("CFAPattern", 41730, 7), new C2259321Dbu("CustomRendered", 41985, 3), new C2259321Dbu("ExposureMode", 41986, 3), new C2259321Dbu("WhiteBalance", 41987, 3), new C2259321Dbu("DigitalZoomRatio", 41988, 5), new C2259321Dbu("FocalLengthIn35mmFilm", 41989, 3), new C2259321Dbu("SceneCaptureType", 41990, 3), new C2259321Dbu("GainControl", 41991, 3), new C2259321Dbu("Contrast", 41992, 3), new C2259321Dbu("Saturation", 41993, 3), new C2259321Dbu("Sharpness", 41994, 3), new C2259321Dbu("DeviceSettingDescription", 41995, 7), new C2259321Dbu("SubjectDistanceRange", 41996, 3), new C2259321Dbu("ImageUniqueID", 42016, 2), new C2259321Dbu("CameraOwnerName", 42032, 2), new C2259321Dbu("BodySerialNumber", 42033, 2), new C2259321Dbu("LensSpecification", 42034, 5), new C2259321Dbu("LensMake", 42035, 2), new C2259321Dbu("LensModel", 42036, 2), new C2259321Dbu("Gamma", 42240, 5), new C2259321Dbu("DNGVersion", 50706, 1), new C2259321Dbu("DefaultCropSize", 50720, 3, 4)};
        C2259321Dbu[] c2259321DbuArr3 = {new C2259321Dbu("GPSVersionID", 0, 1), new C2259321Dbu("GPSLatitudeRef", 1, 2), new C2259321Dbu("GPSLatitude", 2, 5, 10), new C2259321Dbu("GPSLongitudeRef", 3, 2), new C2259321Dbu("GPSLongitude", 4, 5, 10), new C2259321Dbu("GPSAltitudeRef", 5, 1), new C2259321Dbu("GPSAltitude", 6, 5), new C2259321Dbu("GPSTimeStamp", 7, 5), new C2259321Dbu("GPSSatellites", 8, 2), new C2259321Dbu("GPSStatus", 9, 2), new C2259321Dbu("GPSMeasureMode", 10, 2), new C2259321Dbu("GPSDOP", 11, 5), new C2259321Dbu("GPSSpeedRef", 12, 2), new C2259321Dbu("GPSSpeed", 13, 5), new C2259321Dbu("GPSTrackRef", 14, 2), new C2259321Dbu("GPSTrack", 15, 5), new C2259321Dbu("GPSImgDirectionRef", 16, 2), new C2259321Dbu("GPSImgDirection", 17, 5), new C2259321Dbu("GPSMapDatum", 18, 2), new C2259321Dbu("GPSDestLatitudeRef", 19, 2), new C2259321Dbu("GPSDestLatitude", 20, 5), new C2259321Dbu("GPSDestLongitudeRef", 21, 2), new C2259321Dbu("GPSDestLongitude", 22, 5), new C2259321Dbu("GPSDestBearingRef", 23, 2), new C2259321Dbu("GPSDestBearing", 24, 5), new C2259321Dbu("GPSDestDistanceRef", 25, 2), new C2259321Dbu("GPSDestDistance", 26, 5), new C2259321Dbu("GPSProcessingMethod", 27, 7), new C2259321Dbu("GPSAreaInformation", 28, 7), new C2259321Dbu("GPSDateStamp", 29, 2), new C2259321Dbu("GPSDifferential", 30, 3), new C2259321Dbu("GPSHPositioningError", 31, 5)};
        C2259321Dbu[] c2259321DbuArr4 = {new C2259321Dbu("InteroperabilityIndex", 1, 2)};
        C2259321Dbu[] c2259321DbuArr5 = {new C2259321Dbu("NewSubfileType", 254, 4), new C2259321Dbu("SubfileType", 255, 4), new C2259321Dbu("ThumbnailImageWidth", 256, 3, 4), new C2259321Dbu("ThumbnailImageLength", 257, 3, 4), new C2259321Dbu("BitsPerSample", 258, 3), new C2259321Dbu("Compression", 259, 3), new C2259321Dbu("PhotometricInterpretation", 262, 3), new C2259321Dbu("ImageDescription", 270, 2), new C2259321Dbu("Make", 271, 2), new C2259321Dbu("Model", 272, 2), new C2259321Dbu("StripOffsets", 273, 3, 4), new C2259321Dbu("ThumbnailOrientation", 274, 3), new C2259321Dbu("SamplesPerPixel", 277, 3), new C2259321Dbu("RowsPerStrip", 278, 3, 4), new C2259321Dbu("StripByteCounts", 279, 3, 4), new C2259321Dbu("XResolution", 282, 5), new C2259321Dbu("YResolution", 283, 5), new C2259321Dbu("PlanarConfiguration", 284, 3), new C2259321Dbu("ResolutionUnit", 296, 3), new C2259321Dbu("TransferFunction", 301, 3), new C2259321Dbu("Software", 305, 2), new C2259321Dbu("DateTime", 306, 2), new C2259321Dbu("Artist", 315, 2), new C2259321Dbu("WhitePoint", 318, 5), new C2259321Dbu("PrimaryChromaticities", 319, 5), new C2259321Dbu("SubIFDPointer", 330, 4), new C2259321Dbu("JPEGInterchangeFormat", 513, 4), new C2259321Dbu("JPEGInterchangeFormatLength", 514, 4), new C2259321Dbu("YCbCrCoefficients", 529, 5), new C2259321Dbu("YCbCrSubSampling", 530, 3), new C2259321Dbu("YCbCrPositioning", 531, 3), new C2259321Dbu("ReferenceBlackWhite", 532, 5), new C2259321Dbu("Copyright", 33432, 2), new C2259321Dbu("ExifIFDPointer", 34665, 4), new C2259321Dbu("GPSInfoIFDPointer", 34853, 4), new C2259321Dbu("DNGVersion", 50706, 1), new C2259321Dbu("DefaultCropSize", 50720, 3, 4)};
        LJJJJI = new C2259321Dbu("StripOffsets", 273, 3);
        LJJJJIZL = new C2259321Dbu[][]{c2259321DbuArr, c2259321DbuArr2, c2259321DbuArr3, c2259321DbuArr4, c2259321DbuArr5, c2259321DbuArr, new C2259321Dbu[]{new C2259321Dbu("ThumbnailImage", 256, 7), new C2259321Dbu("CameraSettingsIFDPointer", 8224, 4), new C2259321Dbu("ImageProcessingIFDPointer", 8256, 4)}, new C2259321Dbu[]{new C2259321Dbu("PreviewImageStart", 257, 4), new C2259321Dbu("PreviewImageLength", 258, 4)}, new C2259321Dbu[]{new C2259321Dbu("AspectFrame", 4371, 3)}, new C2259321Dbu[]{new C2259321Dbu("ColorSpace", 55, 3)}};
        LJJJJJ = new C2259321Dbu[]{new C2259321Dbu("SubIFDPointer", 330, 4), new C2259321Dbu("ExifIFDPointer", 34665, 4), new C2259321Dbu("GPSInfoIFDPointer", 34853, 4), new C2259321Dbu("InteroperabilityIFDPointer", 40965, 4), new C2259321Dbu("CameraSettingsIFDPointer", 8224, 1), new C2259321Dbu("ImageProcessingIFDPointer", 8256, 1)};
        LJJJJJL = new C2259321Dbu("JPEGInterchangeFormat", 513, 4);
        LJJJJL = new C2259321Dbu("JPEGInterchangeFormatLength", 514, 4);
        LJJJJLI = new HashMap[10];
        LJJJJLL = new HashMap[10];
        LJJJJZ = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        LJJJJZI = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        LJJJLIIL = charsetForName;
        LJJJLL = "Exif\u0000\u0000".getBytes(charsetForName);
        LJJJLZIJ = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C2259321Dbu[][] c2259321DbuArr6 = LJJJJIZL;
            if (i >= c2259321DbuArr6.length) {
                HashMap<Integer, Integer> map = LJJJJZI;
                C2259321Dbu[] c2259321DbuArr7 = LJJJJJ;
                map.put(Integer.valueOf(c2259321DbuArr7[0].LIZ), 5);
                map.put(Integer.valueOf(c2259321DbuArr7[1].LIZ), 1);
                map.put(Integer.valueOf(c2259321DbuArr7[2].LIZ), 2);
                map.put(Integer.valueOf(c2259321DbuArr7[3].LIZ), 3);
                map.put(Integer.valueOf(c2259321DbuArr7[4].LIZ), 7);
                map.put(Integer.valueOf(c2259321DbuArr7[5].LIZ), 8);
                PatternProtector.compile(".*[1-9].*");
                LJJJZ = PatternProtector.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                PatternProtector.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                PatternProtector.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            LJJJJLI[i] = new HashMap<>();
            LJJJJLL[i] = new HashMap<>();
            for (C2259321Dbu c2259321Dbu : c2259321DbuArr6[i]) {
                LJJJJLI[i].put(Integer.valueOf(c2259321Dbu.LIZ), c2259321Dbu);
                LJJJJLL[i].put(c2259321Dbu.LIZIZ, c2259321Dbu);
            }
            i++;
        }
    }

    public final void LJJII() {
        int i = 0;
        while (true) {
            HashMap<String, C2259241Dbm>[] mapArr = this.LIZLLL;
            if (i >= mapArr.length) {
                return;
            }
            Iterator<Map.Entry<String, C2259241Dbm>> it2 = mapArr[i].entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
            i++;
        }
    }

    public final void LJJIZ() throws Throwable {
        LJJIJLIJ(0, 5);
        LJJIJLIJ(0, 4);
        LJJIJLIJ(5, 4);
        C2259241Dbm c2259241Dbm = this.LIZLLL[1].get("PixelXDimension");
        C2259241Dbm c2259241Dbm2 = this.LIZLLL[1].get("PixelYDimension");
        if (c2259241Dbm != null && c2259241Dbm2 != null) {
            this.LIZLLL[0].put("ImageWidth", c2259241Dbm);
            this.LIZLLL[0].put("ImageLength", c2259241Dbm2);
        }
        if (this.LIZLLL[4].isEmpty() && LJJ(this.LIZLLL[5])) {
            HashMap<String, C2259241Dbm>[] mapArr = this.LIZLLL;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        LJJ(this.LIZLLL[4]);
    }

    public final void LIZ() {
        String strLJII = LJII("DateTimeOriginal");
        if (strLJII != null && LJII("DateTime") == null) {
            this.LIZLLL[0].put("DateTime", C2259241Dbm.LIZ(strLJII));
        }
        if (LJII("ImageWidth") == null) {
            this.LIZLLL[0].put("ImageWidth", C2259241Dbm.LIZIZ(0L, this.LJFF));
        }
        if (LJII("ImageLength") == null) {
            this.LIZLLL[0].put("ImageLength", C2259241Dbm.LIZIZ(0L, this.LJFF));
        }
        if (LJII("Orientation") == null) {
            this.LIZLLL[0].put("Orientation", C2259241Dbm.LIZIZ(0L, this.LJFF));
        }
        if (LJII("LightSource") == null) {
            this.LIZLLL[1].put("LightSource", C2259241Dbm.LIZIZ(0L, this.LJFF));
        }
    }

    public final int LJIIIIZZ() {
        C2259241Dbm c2259241DbmLJIIIZ = LJIIIZ("Orientation");
        if (c2259241DbmLJIIIZ == null) {
            return 1;
        }
        try {
            return c2259241DbmLJIIIZ.LJII(this.LJFF);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] LJIJI() throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r9.LJI
            r8 = 0
            if (r0 != 0) goto L6
            return r8
        L6:
            byte[] r0 = r9.LJIIJ
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = r9.LIZ     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L74
            if (r0 == 0) goto L18
            X.0VSP r4 = new X.0VSP     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L74
            java.lang.String r0 = r9.LIZ     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L74
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L74
            r5 = r8
            goto L2a
        L18:
            java.io.FileDescriptor r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L74
            java.io.FileDescriptor r5 = android.system.Os.dup(r0)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L74
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            r0 = 0
            android.system.Os.lseek(r5, r0, r2)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            X.0VSP r4 = new X.0VSP     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
        L2a:
            int r1 = r9.LJIIIIZZ     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            int r0 = r9.LJIIL     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            int r1 = r1 + r0
            long r0 = (long) r1     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            long r6 = r4.skip(r0)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            int r1 = r9.LJIIIIZZ     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            int r0 = r9.LJIIL     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            int r1 = r1 + r0
            long r1 = (long) r1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            java.lang.String r3 = "Corrupted image"
            if (r0 != 0) goto L62
            int r0 = r9.LJIIIZ     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            byte[] r2 = new byte[r0]     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            int r1 = r4.read(r2)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            int r0 = r9.LJIIIZ     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            if (r1 != r0) goto L5c
            r9.LJIIJ = r2     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            LIZJ(r4)
            if (r5 == 0) goto L5b
            android.system.Os.close(r5)     // Catch: java.lang.Exception -> L57
            return r2
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5b:
            return r2
        L5c:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            r0.<init>(r3)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            throw r0     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
        L62:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            r0.<init>(r3)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
            throw r0     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L88
        L68:
            r0 = move-exception
            goto L77
        L6a:
            r1 = move-exception
            r4 = r8
            goto L89
        L6d:
            r0 = move-exception
            r4 = r8
            goto L77
        L70:
            r1 = move-exception
            r5 = r8
            r4 = r5
            goto L89
        L74:
            r0 = move-exception
            r4 = r8
            r5 = r8
        L77:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L88
            LIZJ(r4)
            if (r5 == 0) goto L87
            android.system.Os.close(r5)     // Catch: java.lang.Exception -> L83
            return r8
        L83:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L87:
            return r8
        L88:
            r1 = move-exception
        L89:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L88
            LIZJ(r4)
            if (r5 == 0) goto L99
            android.system.Os.close(r5)     // Catch: java.lang.Exception -> L95
            throw r1
        L95:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L99:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2259261Dbo.LJIJI():byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00d7 A[Catch: all -> 0x0100, Exception -> 0x0103, TryCatch #22 {Exception -> 0x0103, all -> 0x0100, blocks: (B:63:0x00d3, B:65:0x00d7, B:66:0x00e5, B:67:0x00ea), top: B:129:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ea A[Catch: all -> 0x0100, Exception -> 0x0103, TRY_LEAVE, TryCatch #22 {Exception -> 0x0103, all -> 0x0100, blocks: (B:63:0x00d3, B:65:0x00d7, B:66:0x00e5, B:67:0x00ea), top: B:129:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2259261Dbo.LJJIIZI():void");
    }

    public final int LJIIZILJ() {
        switch (LJIIIIZZ()) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public C2259261Dbo(String str) throws Throwable {
        C2259321Dbu[][] c2259321DbuArr = LJJJJIZL;
        this.LIZLLL = new HashMap[c2259321DbuArr.length];
        this.LJ = new HashSet(c2259321DbuArr.length);
        this.LJFF = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            this.LIZ = str;
            C0VSP c0vsp = null;
            try {
                C0VSP c0vsp2 = new C0VSP(str);
                try {
                    try {
                        Os.lseek(c0vsp2.getFD(), 0L, OsConstants.SEEK_CUR);
                        this.LIZIZ = c0vsp2.getFD();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ = null;
                    }
                    LJJI(c0vsp2);
                    LIZJ(c0vsp2);
                } catch (Throwable th) {
                    th = th;
                    c0vsp = c0vsp2;
                    TryCatchGuardChecker.doCheck(th);
                    LIZJ(c0vsp);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    public static String LIZIZ(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(C786410Ut5.j4("%02x", new Object[]{Byte.valueOf(b)}));
        }
        return sb.toString();
    }

    public static void LIZJ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static long[] LIZLLL(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        }
        if (obj instanceof long[]) {
            return (long[]) obj;
        }
        return null;
    }

    public static Pair<Integer, Integer> LJIJJLI(String str) {
        int iIntValue;
        int iIntValue2;
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairLJIJJLI = LJIJJLI(strArrSplit[0]);
            if (((Integer) pairLJIJJLI.first).intValue() == 2) {
                return pairLJIJJLI;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair<Integer, Integer> pairLJIJJLI2 = LJIJJLI(strArrSplit[i]);
                if (!((Integer) pairLJIJJLI2.first).equals(pairLJIJJLI.first) && !((Integer) pairLJIJJLI2.second).equals(pairLJIJJLI.first)) {
                    iIntValue = -1;
                } else {
                    iIntValue = ((Integer) pairLJIJJLI.first).intValue();
                }
                if (((Integer) pairLJIJJLI.second).intValue() != -1 && (((Integer) pairLJIJJLI2.first).equals(pairLJIJJLI.second) || ((Integer) pairLJIJJLI2.second).equals(pairLJIJJLI.second))) {
                    iIntValue2 = ((Integer) pairLJIJJLI.second).intValue();
                } else {
                    iIntValue2 = -1;
                }
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairLJIJJLI = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairLJIJJLI = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairLJIJJLI;
        }
        if (str.contains("/")) {
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j = (long) CastDoubleProtector.parseDouble(strArrSplit2[0]);
                    long j2 = (long) CastDoubleProtector.parseDouble(strArrSplit2[1]);
                    if (j >= 0 && j2 >= 0) {
                        if (j <= 2147483647L && j2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return new Pair<>(2, -1);
        }
        try {
            Long lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
            if (lValueOf.longValue() >= 0 && lValueOf.longValue() <= 65535) {
                return new Pair<>(3, 4);
            }
            if (lValueOf.longValue() < 0) {
                return new Pair<>(9, -1);
            }
            return new Pair<>(4, -1);
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
            try {
                CastDoubleProtector.parseDouble(str);
                return new Pair<>(12, -1);
            } catch (NumberFormatException e3) {
                TryCatchGuardChecker.doCheck(e3);
                return new Pair<>(2, -1);
            }
        }
    }

    public static ByteOrder LJJIII(C2259281Dbq c2259281Dbq) throws IOException {
        short s = c2259281Dbq.readShort();
        if (s != 18761) {
            if (s == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid byte order: ");
            sbLIZ.append(Integer.toHexString(s));
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final String LJII(String str) {
        C2259251Dbn[] c2259251DbnArr;
        C2259241Dbm c2259241DbmLJIIIZ = LJIIIZ(str);
        if (c2259241DbmLJIIIZ != null) {
            if (!LJJJJZ.contains(str)) {
                return c2259241DbmLJIIIZ.LJIIIIZZ(this.LJFF);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c2259241DbmLJIIIZ.LIZ;
                if ((i != 5 && i != 10) || (c2259251DbnArr = (C2259251Dbn[]) c2259241DbmLJIIIZ.LJIIIZ(this.LJFF)) == null || c2259251DbnArr.length != 3) {
                    return null;
                }
                C2259251Dbn c2259251Dbn = c2259251DbnArr[0];
                C2259251Dbn c2259251Dbn2 = c2259251DbnArr[1];
                C2259251Dbn c2259251Dbn3 = c2259251DbnArr[2];
                return C786410Ut5.j4("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (c2259251Dbn.LIZ / c2259251Dbn.LIZIZ)), Integer.valueOf((int) (c2259251Dbn2.LIZ / c2259251Dbn2.LIZIZ)), Integer.valueOf((int) (c2259251Dbn3.LIZ / c2259251Dbn3.LIZIZ))});
            }
            try {
                return Double.toString(c2259241DbmLJIIIZ.LJI(this.LJFF));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public final C2259241Dbm LJIIIZ(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < LJJJJIZL.length; i++) {
            C2259241Dbm c2259241Dbm = this.LIZLLL[i].get(str);
            if (c2259241Dbm != null) {
                return c2259241Dbm;
            }
        }
        return null;
    }

    public final void LJIIJ(final C2259281Dbq c2259281Dbq) throws IOException {
        String strLJFF;
        String strLJI;
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new MediaDataSource() { // from class: X.1Dbs
                public long LL;

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }

                @Override // android.media.MediaDataSource
                public final long getSize() {
                    return -1L;
                }

                @Override // android.media.MediaDataSource
                public final int readAt(long j, byte[] bArr, int i2, int i3) {
                    if (i3 == 0) {
                        return 0;
                    }
                    if (j < 0) {
                        return -1;
                    }
                    try {
                        long j2 = this.LL;
                        if (j2 != j) {
                            if (j2 >= 0 && j >= j2 + ((long) c2259281Dbq.available())) {
                                return -1;
                            }
                            c2259281Dbq.LIZ(j);
                            this.LL = j;
                        }
                        if (i3 > c2259281Dbq.available()) {
                            i3 = c2259281Dbq.available();
                        }
                        int i4 = c2259281Dbq.read(bArr, i2, i3);
                        if (i4 >= 0) {
                            this.LL += (long) i4;
                            return i4;
                        }
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    this.LL = -1L;
                    return -1;
                }
            });
            String strLJII = null;
            String strLJLJI = C2204961BRm.LJLJI(mediaMetadataRetriever, 33, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
            String strLJLJI2 = C2204961BRm.LJLJI(mediaMetadataRetriever, 34, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
            String strLJLJI3 = C2204961BRm.LJLJI(mediaMetadataRetriever, 26, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
            String strLJLJI4 = C2204961BRm.LJLJI(mediaMetadataRetriever, 17, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
            if ("yes".equals(strLJLJI3)) {
                String strLJLJI5 = C2204961BRm.LJLJI(mediaMetadataRetriever, 29, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
                strLJFF = C2204961BRm.LJLJI(mediaMetadataRetriever, 30, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
                strLJI = C2204961BRm.LJLJI(mediaMetadataRetriever, 31, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
                strLJII = strLJLJI5;
            } else if ("yes".equals(strLJLJI4)) {
                strLJII = C20144413ru.LJII(mediaMetadataRetriever);
                strLJFF = C20144413ru.LJFF(mediaMetadataRetriever);
                strLJI = C20144413ru.LJI(mediaMetadataRetriever);
            } else {
                strLJFF = null;
                strLJI = null;
            }
            if (strLJII != null) {
                this.LIZLLL[0].put("ImageWidth", C2259241Dbm.LJ(Integer.parseInt(strLJII), this.LJFF));
            }
            if (strLJFF != null) {
                this.LIZLLL[0].put("ImageLength", C2259241Dbm.LJ(Integer.parseInt(strLJFF), this.LJFF));
            }
            if (strLJI != null) {
                int i2 = Integer.parseInt(strLJI);
                if (i2 != 90) {
                    if (i2 != 180) {
                        if (i2 != 270) {
                            i = 1;
                        } else {
                            i = 8;
                        }
                    } else {
                        i = 3;
                    }
                } else {
                    i = 6;
                }
                this.LIZLLL[0].put("Orientation", C2259241Dbm.LJ(i, this.LJFF));
            }
            if (strLJLJI != null && strLJLJI2 != null) {
                int i3 = Integer.parseInt(strLJLJI);
                int i4 = Integer.parseInt(strLJLJI2);
                if (i4 > 6) {
                    c2259281Dbq.LIZ(i3);
                    byte[] bArr = new byte[6];
                    if (c2259281Dbq.read(bArr) == 6) {
                        int i5 = i3 + 6;
                        int i6 = i4 - 6;
                        if (Arrays.equals(bArr, LJJJLL)) {
                            byte[] bArr2 = new byte[i6];
                            if (c2259281Dbq.read(bArr2) == i6) {
                                this.LJIIL = i5;
                                LJJIIJ(0, bArr2);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [X.1Dbo] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.1Dbo] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6, types: [X.1Dbq, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIL(java.io.BufferedInputStream r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2259261Dbo.LJIIL(java.io.BufferedInputStream):int");
    }

    public final void LJIILIIL(C2259281Dbq c2259281Dbq) throws Throwable {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        LJIILLIIL(c2259281Dbq);
        C2259241Dbm c2259241Dbm = this.LIZLLL[1].get("MakerNote");
        if (c2259241Dbm != null) {
            C2259281Dbq c2259281Dbq2 = new C2259281Dbq(c2259241Dbm.LIZLLL);
            c2259281Dbq2.LLILLJJLI = this.LJFF;
            byte[] bArr = LJJII;
            byte[] bArr2 = new byte[bArr.length];
            c2259281Dbq2.readFully(bArr2);
            c2259281Dbq2.LIZ(0L);
            byte[] bArr3 = LJJIII;
            byte[] bArr4 = new byte[bArr3.length];
            c2259281Dbq2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c2259281Dbq2.LIZ(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c2259281Dbq2.LIZ(12L);
            }
            LJJIIJZLJL(c2259281Dbq2, 6);
            C2259241Dbm c2259241Dbm2 = this.LIZLLL[7].get("PreviewImageStart");
            C2259241Dbm c2259241Dbm3 = this.LIZLLL[7].get("PreviewImageLength");
            if (c2259241Dbm2 != null && c2259241Dbm3 != null) {
                this.LIZLLL[5].put("JPEGInterchangeFormat", c2259241Dbm2);
                this.LIZLLL[5].put("JPEGInterchangeFormatLength", c2259241Dbm3);
            }
            C2259241Dbm c2259241Dbm4 = this.LIZLLL[8].get("AspectFrame");
            if (c2259241Dbm4 != null && (iArr = (int[]) c2259241Dbm4.LJIIIZ(this.LJFF)) != null && iArr.length == 4 && (i = iArr[2]) > (i2 = iArr[0]) && (i3 = iArr[3]) > (i4 = iArr[1])) {
                int i5 = (i - i2) + 1;
                int i6 = (i3 - i4) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C2259241Dbm c2259241DbmLJ = C2259241Dbm.LJ(i5, this.LJFF);
                C2259241Dbm c2259241DbmLJ2 = C2259241Dbm.LJ(i6, this.LJFF);
                this.LIZLLL[0].put("ImageWidth", c2259241DbmLJ);
                this.LIZLLL[0].put("ImageLength", c2259241DbmLJ2);
            }
        }
    }

    public final void LJIILJJIL(C2259281Dbq c2259281Dbq) throws Throwable {
        c2259281Dbq.mark(0);
        c2259281Dbq.LLILLJJLI = ByteOrder.BIG_ENDIAN;
        byte[] bArr = LJJIIJ;
        c2259281Dbq.skipBytes(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c2259281Dbq.readInt();
                int i2 = length + 4;
                byte[] bArr2 = new byte[4];
                if (c2259281Dbq.read(bArr2) == 4) {
                    int i3 = i2 + 4;
                    if (i3 == 16 && !Arrays.equals(bArr2, LJJIIZ)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, LJJIIZI)) {
                        if (Arrays.equals(bArr2, LJJIIJZLJL)) {
                            byte[] bArr3 = new byte[i];
                            if (c2259281Dbq.read(bArr3) == i) {
                                int i4 = c2259281Dbq.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == i4) {
                                    this.LJIIL = i3;
                                    LJJIIJ(0, bArr3);
                                    LJJIZ();
                                    LJJIJL(new C2259281Dbq(bArr3));
                                    return;
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                                sbLIZ.append(i4);
                                sbLIZ.append(", calculated CRC value: ");
                                sbLIZ.append(crc32.getValue());
                                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Failed to read given length for given PNG chunk type: ");
                            sbLIZ2.append(LIZIZ(bArr2));
                            throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        int i5 = i + 4;
                        c2259281Dbq.skipBytes(i5);
                        length = i3 + i5;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void LJIILL(C2259281Dbq c2259281Dbq) throws Throwable {
        c2259281Dbq.mark(0);
        c2259281Dbq.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c2259281Dbq.read(bArr);
        c2259281Dbq.read(bArr2);
        c2259281Dbq.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c2259281Dbq.LIZ(i);
        c2259281Dbq.read(bArr4);
        LJIIJJI(new C2259281Dbq(bArr4), i, 5);
        c2259281Dbq.LIZ(i3);
        c2259281Dbq.LLILLJJLI = ByteOrder.BIG_ENDIAN;
        int i4 = c2259281Dbq.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c2259281Dbq.readUnsignedShort();
            int unsignedShort2 = c2259281Dbq.readUnsignedShort();
            if (unsignedShort == LJJJJI.LIZ) {
                short s = c2259281Dbq.readShort();
                short s2 = c2259281Dbq.readShort();
                C2259241Dbm c2259241DbmLJ = C2259241Dbm.LJ(s, this.LJFF);
                C2259241Dbm c2259241DbmLJ2 = C2259241Dbm.LJ(s2, this.LJFF);
                this.LIZLLL[0].put("ImageLength", c2259241DbmLJ);
                this.LIZLLL[0].put("ImageWidth", c2259241DbmLJ2);
                return;
            }
            c2259281Dbq.skipBytes(unsignedShort2);
        }
    }

    public final void LJIILLIIL(C2259281Dbq c2259281Dbq) throws Throwable {
        C2259241Dbm c2259241Dbm;
        LJJIFFI(c2259281Dbq, c2259281Dbq.available());
        LJJIIJZLJL(c2259281Dbq, 0);
        LJJIL(c2259281Dbq, 0);
        LJJIL(c2259281Dbq, 5);
        LJJIL(c2259281Dbq, 4);
        LJJIZ();
        if (this.LIZJ == 8 && (c2259241Dbm = this.LIZLLL[1].get("MakerNote")) != null) {
            C2259281Dbq c2259281Dbq2 = new C2259281Dbq(c2259241Dbm.LIZLLL);
            c2259281Dbq2.LLILLJJLI = this.LJFF;
            c2259281Dbq2.LIZ(6L);
            LJJIIJZLJL(c2259281Dbq2, 9);
            C2259241Dbm c2259241Dbm2 = this.LIZLLL[9].get("ColorSpace");
            if (c2259241Dbm2 != null) {
                this.LIZLLL[1].put("ColorSpace", c2259241Dbm2);
            }
        }
    }

    public final void LJIJ(C2259281Dbq c2259281Dbq) throws Throwable {
        LJIILLIIL(c2259281Dbq);
        C2259241Dbm c2259241Dbm = this.LIZLLL[0].get("JpgFromRaw");
        if (c2259241Dbm != null) {
            LJIIJJI(new C2259281Dbq(c2259241Dbm.LIZLLL), (int) c2259241Dbm.LIZJ, 5);
        }
        C2259241Dbm c2259241Dbm2 = this.LIZLLL[0].get("ISO");
        C2259241Dbm c2259241Dbm3 = this.LIZLLL[1].get("PhotographicSensitivity");
        if (c2259241Dbm2 != null && c2259241Dbm3 == null) {
            this.LIZLLL[1].put("PhotographicSensitivity", c2259241Dbm2);
        }
    }

    public final void LJIJJ(C2259281Dbq c2259281Dbq) throws Throwable {
        c2259281Dbq.mark(0);
        c2259281Dbq.LLILLJJLI = ByteOrder.LITTLE_ENDIAN;
        c2259281Dbq.skipBytes(LJJIJ.length);
        int i = c2259281Dbq.readInt() + 8;
        int iSkipBytes = c2259281Dbq.skipBytes(LJJIJIIJI.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (c2259281Dbq.read(bArr) == 4) {
                    int i2 = c2259281Dbq.readInt();
                    int i3 = iSkipBytes + 4 + 4;
                    if (Arrays.equals(LJJIJIIJIL, bArr)) {
                        byte[] bArr2 = new byte[i2];
                        if (c2259281Dbq.read(bArr2) == i2) {
                            this.LJIIL = i3;
                            LJJIIJ(0, bArr2);
                            LJJIJL(new C2259281Dbq(bArr2));
                            return;
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Failed to read given length for given PNG chunk type: ");
                            sbLIZ.append(LIZIZ(bArr));
                            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    if (i2 % 2 == 1) {
                        i2++;
                    }
                    int i4 = i3 + i2;
                    if (i4 != i) {
                        if (i4 <= i) {
                            int iSkipBytes2 = c2259281Dbq.skipBytes(i2);
                            if (iSkipBytes2 == i2) {
                                iSkipBytes = i3 + iSkipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final boolean LJJ(HashMap map) throws Throwable {
        C2259241Dbm c2259241Dbm = (C2259241Dbm) map.get("ImageLength");
        C2259241Dbm c2259241Dbm2 = (C2259241Dbm) map.get("ImageWidth");
        if (c2259241Dbm != null && c2259241Dbm2 != null) {
            int iLJII = c2259241Dbm.LJII(this.LJFF);
            int iLJII2 = c2259241Dbm2.LJII(this.LJFF);
            if (iLJII <= 512 && iLJII2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJJI(C0VSP c0vsp) {
        for (int i = 0; i < LJJJJIZL.length; i++) {
            try {
                try {
                    this.LIZLLL[i] = new HashMap<>();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    LIZ();
                    if (!LJIIZILJ) {
                        return;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZ();
                if (LJIIZILJ) {
                    LJJII();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(c0vsp, 5000);
        this.LIZJ = LJIIL(bufferedInputStream);
        C2259281Dbq c2259281Dbq = new C2259281Dbq(bufferedInputStream);
        switch (this.LIZJ) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJIILLIIL(c2259281Dbq);
                break;
            case 4:
                LJIIJJI(c2259281Dbq, 0, 0);
                LIZ();
                if (LJIIZILJ) {
                    LJJII();
                    return;
                }
                return;
            case 7:
                LJIILIIL(c2259281Dbq);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJIILL(c2259281Dbq);
                LIZ();
                if (LJIIZILJ) {
                    LJJII();
                    return;
                }
                return;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJIJ(c2259281Dbq);
                LIZ();
                if (LJIIZILJ) {
                    LJJII();
                    return;
                }
                return;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJIIJ(c2259281Dbq);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LJIILJJIL(c2259281Dbq);
                LIZ();
                if (LJIIZILJ) {
                    LJJII();
                    return;
                }
                return;
            case 14:
                LJIJJ(c2259281Dbq);
                LIZ();
                if (LJIIZILJ) {
                    LJJII();
                    return;
                }
                return;
        }
        c2259281Dbq.LIZ(this.LJIIL);
        LJJIJL(c2259281Dbq);
        LIZ();
        if (!LJIIZILJ) {
            return;
        }
        LJJII();
    }

    public final void LJJIIZ(String str) {
        for (int i = 0; i < LJJJJIZL.length; i++) {
            this.LIZLLL[i].remove(str);
        }
    }

    public final void LJJIJIL(String str) {
        C2259321Dbu c2259321Dbu;
        int i;
        C2259241Dbm c2259241Dbm;
        String strLIZIZ;
        String string = str;
        int i2 = 2;
        int i3 = 1;
        if (string != null && LJJJJZ.contains("UserComment")) {
            if ("UserComment".equals("GPSTimeStamp")) {
                Matcher matcher = LJJJZ.matcher(string);
                if (!matcher.find()) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(CastIntegerProtector.parseInt(matcher.group(1)));
                sbLIZ.append("/1,");
                sbLIZ.append(CastIntegerProtector.parseInt(matcher.group(2)));
                sbLIZ.append("/1,");
                sbLIZ.append(CastIntegerProtector.parseInt(matcher.group(3)));
                sbLIZ.append("/1");
                string = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                try {
                    string = new C2259251Dbn((long) (CastDoubleProtector.parseDouble(string) * 10000.0d), 10000L).toString();
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
        }
        char c = 0;
        int i4 = 0;
        while (i4 < LJJJJIZL.length) {
            if ((i4 != 4 || this.LJI) && (c2259321Dbu = LJJJJLL[i4].get("UserComment")) != null) {
                if (string == null) {
                    this.LIZLLL[i4].remove("UserComment");
                } else {
                    Pair<Integer, Integer> pairLJIJJLI = LJIJJLI(string);
                    if (c2259321Dbu.LIZJ != ((Integer) pairLJIJJLI.first).intValue() && c2259321Dbu.LIZJ != ((Integer) pairLJIJJLI.second).intValue()) {
                        int i5 = c2259321Dbu.LIZLLL;
                        if (i5 != -1 && (i5 == ((Integer) pairLJIJJLI.first).intValue() || c2259321Dbu.LIZLLL == ((Integer) pairLJIJJLI.second).intValue())) {
                            i = c2259321Dbu.LIZLLL;
                        } else {
                            i = c2259321Dbu.LIZJ;
                            if (i != i3 && i != 7 && i != i2) {
                                if (LJIIZILJ) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("Given tag (");
                                    sbLIZ2.append("UserComment");
                                    sbLIZ2.append(") value didn't match with one of expected formats: ");
                                    String[] strArr = LJJJI;
                                    sbLIZ2.append(strArr[c2259321Dbu.LIZJ]);
                                    String strLIZIZ2 = "";
                                    if (c2259321Dbu.LIZLLL == -1) {
                                        strLIZIZ = "";
                                    } else {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append(", ");
                                        sbLIZ3.append(strArr[c2259321Dbu.LIZLLL]);
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                    }
                                    sbLIZ2.append(strLIZIZ);
                                    sbLIZ2.append(" (guess: ");
                                    sbLIZ2.append(strArr[((Integer) pairLJIJJLI.first).intValue()]);
                                    if (((Integer) pairLJIJJLI.second).intValue() != -1) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append(", ");
                                        sbLIZ4.append(strArr[((Integer) pairLJIJJLI.second).intValue()]);
                                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                                    }
                                    sbLIZ2.append(strLIZIZ2);
                                    sbLIZ2.append(")");
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                }
                            }
                        }
                    } else {
                        i = c2259321Dbu.LIZJ;
                    }
                    switch (i) {
                        case 1:
                            HashMap<String, C2259241Dbm> map = this.LIZLLL[i4];
                            if (string.length() == 1 && string.charAt(0) >= '0' && string.charAt(0) <= '1') {
                                c2259241Dbm = new C2259241Dbm(1, new byte[]{(byte) (string.charAt(0) - '0')}, 1);
                            } else {
                                byte[] bytes = string.getBytes(LJJJLIIL);
                                c2259241Dbm = new C2259241Dbm(1, bytes, bytes.length);
                            }
                            map.put("UserComment", c2259241Dbm);
                            break;
                        case 2:
                        case 7:
                            if ("UserComment".equals("UserComment")) {
                                HashMap<String, C2259241Dbm> map2 = this.LIZLLL[i4];
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append(string);
                                sbLIZ5.append(c);
                                byte[] bytes2 = C2188811AlT.LIZIZ(sbLIZ5).getBytes(LJJJLIIL);
                                byte[] bArr = LJJJJ;
                                int length = bArr.length + bytes2.length;
                                byte[] bArr2 = new byte[length];
                                System.arraycopy(bArr, c, bArr2, c, bArr.length);
                                System.arraycopy(bytes2, c, bArr2, bArr.length, bytes2.length);
                                map2.put("UserComment", new C2259241Dbm(7, bArr2, length));
                            } else {
                                this.LIZLLL[i4].put("UserComment", C2259241Dbm.LIZ(string));
                            }
                            break;
                        case 3:
                            String[] strArrSplit = string.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i6 = c; i6 < strArrSplit.length; i6++) {
                                iArr[i6] = CastIntegerProtector.parseInt(strArrSplit[i6]);
                            }
                            this.LIZLLL[i4].put("UserComment", C2259241Dbm.LJFF(iArr, this.LJFF));
                            break;
                        case 4:
                            String[] strArrSplit2 = string.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i7 = c; i7 < strArrSplit2.length; i7++) {
                                jArr[i7] = CastLongProtector.parseLong(strArrSplit2[i7]);
                            }
                            this.LIZLLL[i4].put("UserComment", C2259241Dbm.LIZJ(jArr, this.LJFF));
                            break;
                        case 5:
                            String[] strArrSplit3 = string.split(",", -1);
                            C2259251Dbn[] c2259251DbnArr = new C2259251Dbn[strArrSplit3.length];
                            for (int i8 = c; i8 < strArrSplit3.length; i8++) {
                                String[] strArrSplit4 = strArrSplit3[i8].split("/", -1);
                                c2259251DbnArr[i8] = new C2259251Dbn((long) CastDoubleProtector.parseDouble(strArrSplit4[0]), (long) CastDoubleProtector.parseDouble(strArrSplit4[1]));
                            }
                            this.LIZLLL[i4].put("UserComment", C2259241Dbm.LIZLLL(c2259251DbnArr, this.LJFF));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            String[] strArrSplit5 = string.split(",", -1);
                            int length2 = strArrSplit5.length;
                            int[] iArr2 = new int[length2];
                            for (int i9 = 0; i9 < strArrSplit5.length; i9++) {
                                iArr2[i9] = CastIntegerProtector.parseInt(strArrSplit5[i9]);
                            }
                            HashMap<String, C2259241Dbm> map3 = this.LIZLLL[i4];
                            ByteOrder byteOrder = this.LJFF;
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[LJJJIL[9] * length2]);
                            byteBufferWrap.order(byteOrder);
                            for (int i10 = 0; i10 < length2; i10++) {
                                byteBufferWrap.putInt(iArr2[i10]);
                            }
                            map3.put("UserComment", new C2259241Dbm(9, byteBufferWrap.array(), length2));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            String[] strArrSplit6 = string.split(",", -1);
                            int length3 = strArrSplit6.length;
                            C2259251Dbn[] c2259251DbnArr2 = new C2259251Dbn[length3];
                            int i11 = 0;
                            char c2 = c;
                            while (i11 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i11].split("/", -1);
                                c2259251DbnArr2[i11] = new C2259251Dbn((long) CastDoubleProtector.parseDouble(strArrSplit7[c2]), (long) CastDoubleProtector.parseDouble(strArrSplit7[i3]));
                                i11++;
                                i3 = 1;
                                c2 = 0;
                            }
                            HashMap<String, C2259241Dbm> map4 = this.LIZLLL[i4];
                            ByteOrder byteOrder2 = this.LJFF;
                            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new byte[LJJJIL[10] * length3]);
                            byteBufferWrap2.order(byteOrder2);
                            for (int i12 = 0; i12 < length3; i12++) {
                                C2259251Dbn c2259251Dbn = c2259251DbnArr2[i12];
                                byteBufferWrap2.putInt((int) c2259251Dbn.LIZ);
                                byteBufferWrap2.putInt((int) c2259251Dbn.LIZIZ);
                            }
                            map4.put("UserComment", new C2259241Dbm(10, byteBufferWrap2.array(), length3));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            String[] strArrSplit8 = string.split(",", -1);
                            int length4 = strArrSplit8.length;
                            double[] dArr = new double[length4];
                            for (int i13 = 0; i13 < strArrSplit8.length; i13++) {
                                dArr[i13] = CastDoubleProtector.parseDouble(strArrSplit8[i13]);
                            }
                            HashMap<String, C2259241Dbm> map5 = this.LIZLLL[i4];
                            ByteOrder byteOrder3 = this.LJFF;
                            ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(new byte[LJJJIL[12] * length4]);
                            byteBufferWrap3.order(byteOrder3);
                            for (int i14 = 0; i14 < length4; i14++) {
                                byteBufferWrap3.putDouble(dArr[i14]);
                            }
                            map5.put("UserComment", new C2259241Dbm(12, byteBufferWrap3.array(), length4));
                            break;
                    }
                }
            }
            i4++;
            i2 = 2;
            c = 0;
            i3 = 1;
        }
    }

    public final void LJJIJL(C2259281Dbq c2259281Dbq) throws Throwable {
        C2259241Dbm c2259241Dbm;
        HashMap<String, C2259241Dbm> map = this.LIZLLL[4];
        C2259241Dbm c2259241Dbm2 = map.get("Compression");
        if (c2259241Dbm2 != null) {
            int iLJII = c2259241Dbm2.LJII(this.LJFF);
            this.LJIIJJI = iLJII;
            if (iLJII != 1) {
                if (iLJII != 6) {
                    if (iLJII != 7) {
                        return;
                    }
                } else {
                    LJIL(c2259281Dbq, map);
                    return;
                }
            }
            C2259241Dbm c2259241Dbm3 = map.get("BitsPerSample");
            if (c2259241Dbm3 == null) {
                return;
            }
            int[] iArr = (int[]) c2259241Dbm3.LJIIIZ(this.LJFF);
            int[] iArr2 = LJIJJ;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.LIZJ != 3 || (c2259241Dbm = map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iLJII2 = c2259241Dbm.LJII(this.LJFF);
                if (iLJII2 == 1) {
                    if (!Arrays.equals(iArr, LJIJJLI)) {
                        return;
                    }
                } else if (iLJII2 != 6 || !Arrays.equals(iArr, iArr2)) {
                    return;
                }
            }
            C2259241Dbm c2259241Dbm4 = map.get("StripOffsets");
            C2259241Dbm c2259241Dbm5 = map.get("StripByteCounts");
            if (c2259241Dbm4 == null || c2259241Dbm5 == null) {
                return;
            }
            long[] jArrLIZLLL = LIZLLL(c2259241Dbm4.LJIIIZ(this.LJFF));
            long[] jArrLIZLLL2 = LIZLLL(c2259241Dbm5.LJIIIZ(this.LJFF));
            if (jArrLIZLLL == null || jArrLIZLLL.length == 0 || jArrLIZLLL2 == null || jArrLIZLLL2.length == 0 || jArrLIZLLL.length != jArrLIZLLL2.length) {
                return;
            }
            long j = 0;
            for (long j2 : jArrLIZLLL2) {
                j += j2;
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            this.LJII = true;
            this.LJI = true;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < jArrLIZLLL.length; i4++) {
                int i5 = (int) jArrLIZLLL[i4];
                int i6 = (int) jArrLIZLLL2[i4];
                if (i4 < jArrLIZLLL.length - 1 && i5 + i6 != jArrLIZLLL[i4 + 1]) {
                    this.LJII = false;
                }
                int i7 = i5 - i2;
                if (i7 < 0) {
                    return;
                }
                long j3 = i7;
                if (c2259281Dbq.skip(j3) != j3) {
                    return;
                }
                int i8 = i2 + i7;
                byte[] bArr2 = new byte[i6];
                if (c2259281Dbq.read(bArr2) != i6) {
                    return;
                }
                i2 = i8 + i6;
                System.arraycopy(bArr2, 0, bArr, i3, i6);
                i3 += i6;
            }
            this.LJIIJ = bArr;
            if (!this.LJII) {
                return;
            }
            this.LJIIIIZZ = (int) jArrLIZLLL[0];
            this.LJIIIZ = i;
            return;
        }
        this.LJIIJJI = 6;
        LJIL(c2259281Dbq, map);
    }

    public final void LJJJ(C2259211Dbj c2259211Dbj) throws IOException {
        short s;
        C2259321Dbu[][] c2259321DbuArr = LJJJJIZL;
        int[] iArr = new int[c2259321DbuArr.length];
        int[] iArr2 = new int[c2259321DbuArr.length];
        for (C2259321Dbu c2259321Dbu : LJJJJJ) {
            LJJIIZ(c2259321Dbu.LIZIZ);
        }
        LJJIIZ(LJJJJJL.LIZIZ);
        LJJIIZ(LJJJJL.LIZIZ);
        for (int i = 0; i < LJJJJIZL.length; i++) {
            for (Object obj : this.LIZLLL[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.LIZLLL[i].remove(entry.getKey());
                }
            }
        }
        if (!this.LIZLLL[1].isEmpty()) {
            this.LIZLLL[0].put(LJJJJJ[1].LIZIZ, C2259241Dbm.LIZIZ(0L, this.LJFF));
        }
        if (!this.LIZLLL[2].isEmpty()) {
            this.LIZLLL[0].put(LJJJJJ[2].LIZIZ, C2259241Dbm.LIZIZ(0L, this.LJFF));
        }
        if (!this.LIZLLL[3].isEmpty()) {
            this.LIZLLL[1].put(LJJJJJ[3].LIZIZ, C2259241Dbm.LIZIZ(0L, this.LJFF));
        }
        if (this.LJI) {
            this.LIZLLL[4].put(LJJJJJL.LIZIZ, C2259241Dbm.LIZIZ(0L, this.LJFF));
            this.LIZLLL[4].put(LJJJJL.LIZIZ, C2259241Dbm.LIZIZ(this.LJIIIZ, this.LJFF));
        }
        for (int i2 = 0; i2 < LJJJJIZL.length; i2++) {
            Iterator<Map.Entry<String, C2259241Dbm>> it2 = this.LIZLLL[i2].entrySet().iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                C2259241Dbm value = it2.next().getValue();
                value.getClass();
                int i4 = LJJJIL[value.LIZ] * value.LIZIZ;
                if (i4 > 4) {
                    i3 += i4;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int size = 8;
        for (int i5 = 0; i5 < LJJJJIZL.length; i5++) {
            if (!this.LIZLLL[i5].isEmpty()) {
                iArr[i5] = size;
                size += (this.LIZLLL[i5].size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        if (this.LJI) {
            this.LIZLLL[4].put(LJJJJJL.LIZIZ, C2259241Dbm.LIZIZ(size, this.LJFF));
            this.LJIIIIZZ = size;
            size += this.LJIIIZ;
        }
        if (this.LIZJ == 4) {
            size += 8;
        }
        if (LJIIZILJ) {
            for (int i6 = 0; i6 < LJJJJIZL.length; i6++) {
            }
        }
        if (!this.LIZLLL[1].isEmpty()) {
            this.LIZLLL[0].put(LJJJJJ[1].LIZIZ, C2259241Dbm.LIZIZ(iArr[1], this.LJFF));
        }
        if (!this.LIZLLL[2].isEmpty()) {
            this.LIZLLL[0].put(LJJJJJ[2].LIZIZ, C2259241Dbm.LIZIZ(iArr[2], this.LJFF));
        }
        if (!this.LIZLLL[3].isEmpty()) {
            this.LIZLLL[1].put(LJJJJJ[3].LIZIZ, C2259241Dbm.LIZIZ(iArr[3], this.LJFF));
        }
        int i7 = this.LIZJ;
        if (i7 != 4) {
            if (i7 != 13) {
                if (i7 == 14) {
                    c2259211Dbj.write(LJJIJIIJIL);
                    c2259211Dbj.LIZIZ(size);
                }
            } else {
                c2259211Dbj.LIZIZ(size);
                c2259211Dbj.write(LJJIIJZLJL);
            }
        } else {
            c2259211Dbj.LIZLLL((short) size);
            c2259211Dbj.write(LJJJLL);
        }
        if (this.LJFF == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        } else {
            s = 18761;
        }
        c2259211Dbj.LIZLLL(s);
        c2259211Dbj.LLILLJJLI = this.LJFF;
        c2259211Dbj.LIZLLL((short) 42);
        c2259211Dbj.LIZIZ((int) 8);
        for (int i8 = 0; i8 < LJJJJIZL.length; i8++) {
            if (!this.LIZLLL[i8].isEmpty()) {
                c2259211Dbj.LIZLLL((short) this.LIZLLL[i8].size());
                int size2 = iArr[i8] + 2 + (this.LIZLLL[i8].size() * 12) + 4;
                for (Map.Entry<String, C2259241Dbm> entry2 : this.LIZLLL[i8].entrySet()) {
                    int i9 = LJJJJLL[i8].get(entry2.getKey()).LIZ;
                    C2259241Dbm value2 = entry2.getValue();
                    value2.getClass();
                    int i10 = LJJJIL[value2.LIZ] * value2.LIZIZ;
                    c2259211Dbj.LIZLLL((short) i9);
                    c2259211Dbj.LIZLLL((short) value2.LIZ);
                    c2259211Dbj.LIZIZ(value2.LIZIZ);
                    if (i10 > 4) {
                        c2259211Dbj.LIZIZ(size2);
                        size2 += i10;
                    } else {
                        c2259211Dbj.write(value2.LIZLLL);
                        if (i10 < 4) {
                            do {
                                c2259211Dbj.LIZ(0);
                                i10++;
                            } while (i10 < 4);
                        }
                    }
                }
                if (i8 == 0 && !this.LIZLLL[4].isEmpty()) {
                    c2259211Dbj.LIZIZ(iArr[4]);
                } else {
                    c2259211Dbj.LIZIZ((int) 0);
                }
                Iterator<Map.Entry<String, C2259241Dbm>> it3 = this.LIZLLL[i8].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = it3.next().getValue().LIZLLL;
                    if (bArr.length > 4) {
                        c2259211Dbj.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.LJI) {
            c2259211Dbj.write(LJIJI());
        }
        if (this.LIZJ == 14 && size % 2 == 1) {
            c2259211Dbj.LIZ(0);
        }
        c2259211Dbj.LLILLJJLI = ByteOrder.BIG_ENDIAN;
    }

    public static void LJ(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                outputStream.write(bArr, 0, i);
            } else {
                return;
            }
        }
    }

    public final void LJIL(C2259281Dbq c2259281Dbq, HashMap map) throws Throwable {
        C2259241Dbm c2259241Dbm = (C2259241Dbm) map.get("JPEGInterchangeFormat");
        C2259241Dbm c2259241Dbm2 = (C2259241Dbm) map.get("JPEGInterchangeFormatLength");
        if (c2259241Dbm != null && c2259241Dbm2 != null) {
            int iLJII = c2259241Dbm.LJII(this.LJFF);
            int iLJII2 = c2259241Dbm2.LJII(this.LJFF);
            if (this.LIZJ == 7) {
                iLJII += this.LJIILIIL;
            }
            int iMin = Math.min(iLJII2, c2259281Dbq.LLILLL - iLJII);
            if (iLJII > 0 && iMin > 0) {
                this.LJI = true;
                if (this.LIZ == null && this.LIZIZ == null) {
                    byte[] bArr = new byte[iMin];
                    c2259281Dbq.skip(iLJII);
                    c2259281Dbq.read(bArr);
                    this.LJIIJ = bArr;
                }
                this.LJIIIIZZ = iLJII;
                this.LJIIIZ = iMin;
            }
        }
    }

    public final void LJJIFFI(C2259281Dbq c2259281Dbq, int i) throws IOException {
        ByteOrder byteOrderLJJIII = LJJIII(c2259281Dbq);
        this.LJFF = byteOrderLJJIII;
        c2259281Dbq.LLILLJJLI = byteOrderLJJIII;
        int unsignedShort = c2259281Dbq.readUnsignedShort();
        int i2 = this.LIZJ;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid start code: ");
            sbLIZ.append(Integer.toHexString(unsignedShort));
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i3 = c2259281Dbq.readInt();
        if (i3 >= 8 && i3 < i) {
            int i4 = i3 - 8;
            if (i4 > 0 && c2259281Dbq.skipBytes(i4) != i4) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Couldn't jump to first Ifd: ");
                sbLIZ2.append(i4);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Invalid first Ifd offset: ");
        sbLIZ3.append(i3);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LJJIIJ(int i, byte[] bArr) throws IOException {
        C2259281Dbq c2259281Dbq = new C2259281Dbq(bArr);
        LJJIFFI(c2259281Dbq, bArr.length);
        LJJIIJZLJL(c2259281Dbq, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(X.C2259281Dbq r28, int r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2259261Dbo.LJJIIJZLJL(X.1Dbq, int):void");
    }

    public final void LJJIJ(InputStream inputStream, OutputStream outputStream) throws IOException {
        C2259241Dbm c2259241DbmRemove;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C2259211Dbj c2259211Dbj = new C2259211Dbj(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            c2259211Dbj.LIZ(-1);
            if (dataInputStream.readByte() == -40) {
                c2259211Dbj.LIZ(-40);
                if (LJII("Xmp") != null && this.LJIILLIIL) {
                    c2259241DbmRemove = this.LIZLLL[0].remove("Xmp");
                } else {
                    c2259241DbmRemove = null;
                }
                c2259211Dbj.LIZ(-1);
                c2259211Dbj.LIZ(-31);
                LJJJ(c2259211Dbj);
                if (c2259241DbmRemove != null) {
                    this.LIZLLL[0].put("Xmp", c2259241DbmRemove);
                }
                byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                while (dataInputStream.readByte() == -1) {
                    byte b = dataInputStream.readByte();
                    if (b != -39 && b != -38) {
                        if (b != -31) {
                            c2259211Dbj.LIZ(-1);
                            c2259211Dbj.LIZ(b);
                            int unsignedShort = dataInputStream.readUnsignedShort();
                            c2259211Dbj.LIZLLL((short) unsignedShort);
                            int i = unsignedShort - 2;
                            if (i < 0) {
                                throw new IOException("Invalid length");
                            }
                            while (i > 0) {
                                int i2 = dataInputStream.read(bArr, 0, Math.min(i, SpeechEngineDefines.TTS_WORK_MODE_BOTH));
                                if (i2 >= 0) {
                                    c2259211Dbj.write(bArr, 0, i2);
                                    i -= i2;
                                }
                            }
                        } else {
                            int unsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                            if (unsignedShort2 >= 0) {
                                byte[] bArr2 = new byte[6];
                                if (unsignedShort2 >= 6) {
                                    if (dataInputStream.read(bArr2) == 6) {
                                        if (Arrays.equals(bArr2, LJJJLL)) {
                                            int i3 = unsignedShort2 - 6;
                                            if (dataInputStream.skipBytes(i3) != i3) {
                                                throw new IOException("Invalid length");
                                            }
                                        }
                                    } else {
                                        throw new IOException("Invalid exif");
                                    }
                                }
                                c2259211Dbj.LIZ(-1);
                                c2259211Dbj.LIZ(b);
                                c2259211Dbj.LIZLLL((short) (unsignedShort2 + 2));
                                if (unsignedShort2 >= 6) {
                                    unsignedShort2 -= 6;
                                    c2259211Dbj.write(bArr2);
                                }
                                while (unsignedShort2 > 0) {
                                    int i4 = dataInputStream.read(bArr, 0, Math.min(unsignedShort2, SpeechEngineDefines.TTS_WORK_MODE_BOTH));
                                    if (i4 >= 0) {
                                        c2259211Dbj.write(bArr, 0, i4);
                                        unsignedShort2 -= i4;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        c2259211Dbj.LIZ(-1);
                        c2259211Dbj.LIZ(b);
                        LJ(dataInputStream, c2259211Dbj);
                        return;
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:13:0x006e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void LJJIJIIJI(java.io.InputStream r8, java.io.OutputStream r9) {
        /*
            r7 = this;
            java.io.DataInputStream r4 = new java.io.DataInputStream
            r4.<init>(r8)
            X.1Dbj r5 = new X.1Dbj
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            r5.<init>(r9, r2)
            byte[] r3 = X.C2259261Dbo.LJJIIJ
            int r0 = r3.length
            LJFF(r4, r5, r0)
            int r1 = r7.LJIIL
            r6 = 4
            if (r1 != 0) goto L27
            int r0 = r4.readInt()
            r5.LIZIZ(r0)
            int r0 = r0 + 4
            int r0 = r0 + 4
            LJFF(r4, r5, r0)
        L25:
            r1 = 0
            goto L3a
        L27:
            int r0 = r3.length
            int r1 = r1 - r0
            int r1 = r1 - r6
            int r1 = r1 - r6
            LJFF(r4, r5, r1)
            int r0 = r4.readInt()
            int r0 = r0 + 4
            int r0 = r0 + 4
            r4.skipBytes(r0)
            goto L25
        L3a:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L6e
            r3.<init>()     // Catch: java.lang.Throwable -> L6e
            X.1Dbj r0 = new X.1Dbj     // Catch: java.lang.Throwable -> L6b
            r0.<init>(r3, r2)     // Catch: java.lang.Throwable -> L6b
            r7.LJJJ(r0)     // Catch: java.lang.Throwable -> L6b
            java.io.OutputStream r0 = r0.LL     // Catch: java.lang.Throwable -> L6b
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0     // Catch: java.lang.Throwable -> L6b
            byte[] r2 = r0.toByteArray()     // Catch: java.lang.Throwable -> L6b
            r5.write(r2)     // Catch: java.lang.Throwable -> L6b
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32     // Catch: java.lang.Throwable -> L6b
            r1.<init>()     // Catch: java.lang.Throwable -> L6b
            int r0 = r2.length     // Catch: java.lang.Throwable -> L6b
            int r0 = r0 - r6
            r1.update(r2, r6, r0)     // Catch: java.lang.Throwable -> L6b
            long r1 = r1.getValue()     // Catch: java.lang.Throwable -> L6b
            int r0 = (int) r1     // Catch: java.lang.Throwable -> L6b
            r5.LIZIZ(r0)     // Catch: java.lang.Throwable -> L6b
            LIZJ(r3)
            LJ(r4, r5)
            return
        L6b:
            r0 = move-exception
            r1 = r3
            goto L6f
        L6e:
            r0 = move-exception
        L6f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6e
            LIZJ(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2259261Dbo.LJJIJIIJI(java.io.InputStream, java.io.OutputStream):void");
    }

    public final void LJJIJIIJIL(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C2259281Dbq c2259281Dbq = new C2259281Dbq(inputStream, byteOrder);
        C2259211Dbj c2259211Dbj = new C2259211Dbj(outputStream, byteOrder);
        byte[] bArr = LJJIJ;
        LJFF(c2259281Dbq, c2259211Dbj, bArr.length);
        byte[] bArr2 = LJJIJIIJI;
        c2259281Dbq.skipBytes(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            C2259211Dbj c2259211Dbj2 = new C2259211Dbj(byteArrayOutputStream, byteOrder);
            int i7 = this.LJIIL;
            if (i7 != 0) {
                LJFF(c2259281Dbq, c2259211Dbj2, ((i7 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                c2259281Dbq.skipBytes(4);
                c2259281Dbq.skipBytes(c2259281Dbq.readInt());
                LJJJ(c2259211Dbj2);
            } else {
                byte[] bArr3 = new byte[4];
                if (c2259281Dbq.read(bArr3) == 4) {
                    byte[] bArr4 = LJJIJL;
                    boolean z = false;
                    if (Arrays.equals(bArr3, bArr4)) {
                        int i8 = c2259281Dbq.readInt();
                        if (i8 % 2 == 1) {
                            i6 = i8 + 1;
                        } else {
                            i6 = i8;
                        }
                        byte[] bArr5 = new byte[i6];
                        c2259281Dbq.read(bArr5);
                        byte b = (byte) (8 | bArr5[0]);
                        bArr5[0] = b;
                        if (((b >> 1) & 1) == 1) {
                            z = true;
                        }
                        c2259211Dbj2.write(bArr4);
                        c2259211Dbj2.LIZIZ(i8);
                        c2259211Dbj2.write(bArr5);
                        if (z) {
                            LJI(c2259281Dbq, c2259211Dbj2, LJJIZ, null);
                            while (true) {
                                byte[] bArr6 = new byte[4];
                                inputStream.read(bArr6);
                                if (!Arrays.equals(bArr6, LJJJ)) {
                                    break;
                                }
                                int i9 = c2259281Dbq.readInt();
                                c2259211Dbj2.write(bArr6);
                                c2259211Dbj2.LIZIZ(i9);
                                if (i9 % 2 == 1) {
                                    i9++;
                                }
                                LJFF(c2259281Dbq, c2259211Dbj2, i9);
                            }
                            LJJJ(c2259211Dbj2);
                        } else {
                            LJI(c2259281Dbq, c2259211Dbj2, LJJIL, LJJIJLIJ);
                            LJJJ(c2259211Dbj2);
                        }
                    } else {
                        byte[] bArr7 = LJJIL;
                        if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, LJJIJLIJ)) {
                            int i10 = c2259281Dbq.readInt();
                            if (i10 % 2 == 1) {
                                i = i10 + 1;
                            } else {
                                i = i10;
                            }
                            byte[] bArr8 = new byte[3];
                            if (Arrays.equals(bArr3, bArr7)) {
                                c2259281Dbq.read(bArr8);
                                byte[] bArr9 = new byte[3];
                                if (c2259281Dbq.read(bArr9) == 3 && Arrays.equals(LJJIJIL, bArr9)) {
                                    i2 = c2259281Dbq.readInt();
                                    i3 = (i2 << 18) >> 18;
                                    i4 = (i2 << 2) >> 18;
                                    i -= 10;
                                    i5 = 0;
                                } else {
                                    throw new IOException("Encountered error while checking VP8 signature");
                                }
                            } else if (Arrays.equals(bArr3, LJJIJLIJ)) {
                                if (c2259281Dbq.readByte() == 47) {
                                    i2 = c2259281Dbq.readInt();
                                    i3 = ((i2 << 18) >> 18) + 1;
                                    i4 = ((i2 << 4) >> 18) + 1;
                                    i5 = i2 & 8;
                                    i -= 5;
                                } else {
                                    throw new IOException("Encountered error while checking VP8L signature");
                                }
                            } else {
                                i2 = 0;
                                i3 = 0;
                                i4 = 0;
                                i5 = 0;
                            }
                            c2259211Dbj2.write(bArr4);
                            c2259211Dbj2.LIZIZ(10);
                            byte[] bArr10 = new byte[10];
                            byte b2 = (byte) (bArr10[0] | 8);
                            bArr10[0] = b2;
                            bArr10[0] = (byte) (b2 | (i5 << 4));
                            int i11 = i3 - 1;
                            int i12 = i4 - 1;
                            bArr10[4] = (byte) i11;
                            bArr10[5] = (byte) (i11 >> 8);
                            bArr10[6] = (byte) (i11 >> 16);
                            bArr10[7] = (byte) i12;
                            bArr10[8] = (byte) (i12 >> 8);
                            bArr10[9] = (byte) (i12 >> 16);
                            c2259211Dbj2.write(bArr10);
                            c2259211Dbj2.write(bArr3);
                            c2259211Dbj2.LIZIZ(i10);
                            if (Arrays.equals(bArr3, bArr7)) {
                                c2259211Dbj2.write(bArr8);
                                c2259211Dbj2.write(LJJIJIL);
                                c2259211Dbj2.LIZIZ(i2);
                            } else if (Arrays.equals(bArr3, LJJIJLIJ)) {
                                c2259211Dbj2.write(47);
                                c2259211Dbj2.LIZIZ(i2);
                            }
                            LJFF(c2259281Dbq, c2259211Dbj2, i);
                            LJJJ(c2259211Dbj2);
                        }
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
            }
            LJ(c2259281Dbq, c2259211Dbj2);
            int size = byteArrayOutputStream.size();
            byte[] bArr11 = LJJIJIIJI;
            c2259211Dbj.LIZIZ(size + bArr11.length);
            c2259211Dbj.write(bArr11);
            byteArrayOutputStream.writeTo(c2259211Dbj);
            LIZJ(byteArrayOutputStream);
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            TryCatchGuardChecker.doCheck(th);
            LIZJ(byteArrayOutputStream2);
            throw th;
        }
    }

    public final void LJJIJLIJ(int i, int i2) throws Throwable {
        if (!this.LIZLLL[i].isEmpty() && !this.LIZLLL[i2].isEmpty()) {
            C2259241Dbm c2259241Dbm = this.LIZLLL[i].get("ImageLength");
            C2259241Dbm c2259241Dbm2 = this.LIZLLL[i].get("ImageWidth");
            C2259241Dbm c2259241Dbm3 = this.LIZLLL[i2].get("ImageLength");
            C2259241Dbm c2259241Dbm4 = this.LIZLLL[i2].get("ImageWidth");
            if (c2259241Dbm != null && c2259241Dbm2 != null && c2259241Dbm3 != null && c2259241Dbm4 != null) {
                int iLJII = c2259241Dbm.LJII(this.LJFF);
                int iLJII2 = c2259241Dbm2.LJII(this.LJFF);
                int iLJII3 = c2259241Dbm3.LJII(this.LJFF);
                int iLJII4 = c2259241Dbm4.LJII(this.LJFF);
                if (iLJII < iLJII3 && iLJII2 < iLJII4) {
                    HashMap<String, C2259241Dbm>[] mapArr = this.LIZLLL;
                    HashMap<String, C2259241Dbm> map = mapArr[i];
                    mapArr[i] = mapArr[i2];
                    mapArr[i2] = map;
                }
            }
        }
    }

    public final void LJJIL(C2259281Dbq c2259281Dbq, int i) throws Throwable {
        C2259241Dbm c2259241DbmLJ;
        C2259241Dbm c2259241DbmLJ2;
        C2259241Dbm c2259241Dbm = this.LIZLLL[i].get("DefaultCropSize");
        C2259241Dbm c2259241Dbm2 = this.LIZLLL[i].get("SensorTopBorder");
        C2259241Dbm c2259241Dbm3 = this.LIZLLL[i].get("SensorLeftBorder");
        C2259241Dbm c2259241Dbm4 = this.LIZLLL[i].get("SensorBottomBorder");
        C2259241Dbm c2259241Dbm5 = this.LIZLLL[i].get("SensorRightBorder");
        if (c2259241Dbm != null) {
            if (c2259241Dbm.LIZ == 5) {
                C2259251Dbn[] c2259251DbnArr = (C2259251Dbn[]) c2259241Dbm.LJIIIZ(this.LJFF);
                if (c2259251DbnArr != null && c2259251DbnArr.length == 2) {
                    c2259241DbmLJ = C2259241Dbm.LIZLLL(new C2259251Dbn[]{c2259251DbnArr[0]}, this.LJFF);
                    c2259241DbmLJ2 = C2259241Dbm.LIZLLL(new C2259251Dbn[]{c2259251DbnArr[1]}, this.LJFF);
                } else {
                    return;
                }
            } else {
                int[] iArr = (int[]) c2259241Dbm.LJIIIZ(this.LJFF);
                if (iArr != null && iArr.length == 2) {
                    c2259241DbmLJ = C2259241Dbm.LJ(iArr[0], this.LJFF);
                    c2259241DbmLJ2 = C2259241Dbm.LJ(iArr[1], this.LJFF);
                } else {
                    return;
                }
            }
            this.LIZLLL[i].put("ImageWidth", c2259241DbmLJ);
            this.LIZLLL[i].put("ImageLength", c2259241DbmLJ2);
            return;
        }
        if (c2259241Dbm2 != null && c2259241Dbm3 != null && c2259241Dbm4 != null && c2259241Dbm5 != null) {
            int iLJII = c2259241Dbm2.LJII(this.LJFF);
            int iLJII2 = c2259241Dbm4.LJII(this.LJFF);
            int iLJII3 = c2259241Dbm5.LJII(this.LJFF);
            int iLJII4 = c2259241Dbm3.LJII(this.LJFF);
            if (iLJII2 <= iLJII || iLJII3 <= iLJII4) {
                return;
            }
            C2259241Dbm c2259241DbmLJ3 = C2259241Dbm.LJ(iLJII2 - iLJII, this.LJFF);
            C2259241Dbm c2259241DbmLJ4 = C2259241Dbm.LJ(iLJII3 - iLJII4, this.LJFF);
            this.LIZLLL[i].put("ImageLength", c2259241DbmLJ3);
            this.LIZLLL[i].put("ImageWidth", c2259241DbmLJ4);
            return;
        }
        C2259241Dbm c2259241Dbm6 = this.LIZLLL[i].get("ImageLength");
        C2259241Dbm c2259241Dbm7 = this.LIZLLL[i].get("ImageWidth");
        if (c2259241Dbm6 != null && c2259241Dbm7 != null) {
            return;
        }
        C2259241Dbm c2259241Dbm8 = this.LIZLLL[i].get("JPEGInterchangeFormat");
        C2259241Dbm c2259241Dbm9 = this.LIZLLL[i].get("JPEGInterchangeFormatLength");
        if (c2259241Dbm8 == null || c2259241Dbm9 == null) {
            return;
        }
        int iLJII5 = c2259241Dbm8.LJII(this.LJFF);
        int iLJII6 = c2259241Dbm8.LJII(this.LJFF);
        c2259281Dbq.LIZ(iLJII5);
        byte[] bArr = new byte[iLJII6];
        c2259281Dbq.read(bArr);
        LJIIJJI(new C2259281Dbq(bArr), iLJII5, i);
    }

    public static void LJFF(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int iMin = Math.min(i, 8192);
            int i2 = inputStream.read(bArr, 0, iMin);
            if (i2 == iMin) {
                i -= i2;
                outputStream.write(bArr, 0, i2);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ec A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(X.C2259281Dbq r19, int r20, int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2259261Dbo.LJIIJJI(X.1Dbq, int, int):void");
    }

    public static void LJI(C2259281Dbq c2259281Dbq, C2259211Dbj c2259211Dbj, byte[] bArr, byte[] bArr2) throws IOException {
        String strLIZIZ;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (c2259281Dbq.read(bArr3) != 4) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = LJJJLIIL;
                sbLIZ.append(new String(bArr, charset));
                if (bArr2 == null) {
                    strLIZIZ = "";
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(" or ");
                    sbLIZ2.append(new String(bArr2, charset));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                sbLIZ.append(strLIZIZ);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
            int i = c2259281Dbq.readInt();
            c2259211Dbj.write(bArr3);
            c2259211Dbj.LIZIZ(i);
            if (i % 2 == 1) {
                i++;
            }
            LJFF(c2259281Dbq, c2259211Dbj, i);
            if (!Arrays.equals(bArr3, bArr)) {
                if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                    return;
                }
            } else {
                return;
            }
        }
    }
}

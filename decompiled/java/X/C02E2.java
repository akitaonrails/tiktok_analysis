package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02E2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02E2 extends Message<C02E2, C02KD> {
    public static final ProtoAdapter<C02E2> ADAPTER = new ProtoAdapter<C02E2>() { // from class: X.026I
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02E2 decode(ProtoReader protoReader) {
            C02E2 c02e2 = new C02E2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c02e2.enable_view_report = ProtoAdapter.BOOL.decode(protoReader);
                                    }
                                } else {
                                    c02e2.enable_click_report = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c02e2.view_threshold_duration = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02e2.click_threshold_duration = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02e2.attr_touch_point = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02e2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02E2 c02e2) {
            C02E2 c02e22 = c02e2;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02e22.attr_touch_point) + protoAdapter.encodedSizeWithTag(2, c02e22.click_threshold_duration) + protoAdapter.encodedSizeWithTag(3, c02e22.view_threshold_duration);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c02e22.enable_click_report) + protoAdapter2.encodedSizeWithTag(5, c02e22.enable_view_report) + c02e22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02E2 c02e2) {
            C02E2 c02e22 = c02e2;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02e22.attr_touch_point);
            protoAdapter.encodeWithTag(protoWriter, 2, c02e22.click_threshold_duration);
            protoAdapter.encodeWithTag(protoWriter, 3, c02e22.view_threshold_duration);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 4, c02e22.enable_click_report);
            protoAdapter2.encodeWithTag(protoWriter, 5, c02e22.enable_view_report);
            protoWriter.writeBytes(c02e22.unknownFields());
        }
    };
    public Integer attr_touch_point;
    public Integer click_threshold_duration;
    public Boolean enable_click_report;
    public Boolean enable_view_report;
    public Integer view_threshold_duration;

    public C02E2() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

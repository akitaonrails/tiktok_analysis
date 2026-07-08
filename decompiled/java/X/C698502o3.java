package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02o3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C698502o3 extends Message<C698502o3, C698602o4> {
    public static final ProtoAdapter<C698502o3> ADAPTER = new ProtoAdapter<C698502o3>() { // from class: X.02o2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C698502o3 decode(ProtoReader protoReader) {
            C698502o3 c698502o3 = new C698502o3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c698502o3.bottom = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c698502o3.end = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c698502o3.top = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c698502o3.start = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c698502o3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C698502o3 c698502o3) {
            C698502o3 c698502o32 = c698502o3;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c698502o32.start) + protoAdapter.encodedSizeWithTag(2, c698502o32.top) + protoAdapter.encodedSizeWithTag(3, c698502o32.end) + protoAdapter.encodedSizeWithTag(4, c698502o32.bottom) + c698502o32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C698502o3 c698502o3) {
        }
    };
    public Integer bottom;
    public Integer end;
    public Integer start;
    public Integer top;

    public C698502o3() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C698602o4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
